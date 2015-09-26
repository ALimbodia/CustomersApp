app.controller('displayController', ['$scope', '$http', '$location', '$rootScope',
	function($scope, $http, $location, $rootScope) {
		$scope.customers = [];

		$http.get('test/customers').success(function(data) {
			$scope.customers = data;
		});

		$scope.doEdit = function(customer) {
			$rootScope.currentCustomer = customer;
			$location.url('/update');
		};

		$scope.doCreate = function  () {
			$location.url('/create');
		}

		$scope.doDelete = function(customer) {
			// $http.delete('test/customers');
			$http({
				method: 'DELETE',
				data: customer,
				url: 'test/customers',
				headers: {
					'Content-Type': 'application/json'
				}
			}).then(function(status) {
				$http.get('test/customers').success(function(data) {
					$scope.customers = data;
				});
			})
		};


	}
]);


app.controller('updateController', ['$scope', '$http', '$location', '$rootScope',
	function($scope, $http, $location, $rootScope) {

		$scope.doUpdate = function(customer) {
			console.log(customer);
			$http.post('test/customers', customer).then(function(status) {
				$location.url("/");
			}, function(status) {
				console.log("Request failure.");
			});
		};
	}
]);

app.controller('createController', ['$scope', '$http', '$location', '$rootScope',
	function($scope, $http, $location, $rootScope) {
		$scope.customer =  {};
		$scope.doCreate = function() {
			$http.put('test/customers', $scope.customer).then(function (status) {
				$location.url('/');
			});
		};
	}
]);