app.controller('displayController', function ($scope, $http, $location) {
	$scope.customers = [];

	$http.get('test/customers').success(function(data) {
      $scope.customers = data;
    });

	$scope.doEdit = function (customer) {
		$scope.currentCustomer = customer;
		$location.path('/update');
	}

	$scope.doDelete = function (customerId) {
		
	}
})