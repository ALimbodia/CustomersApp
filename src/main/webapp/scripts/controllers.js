app.controller('displayController', function ($scope, $http) {
	$scope.customers = [];

	$http.get('test/customers').success(function(data) {
      $scope.customers = data;
    });

	$scope.doEdit = function (customerId) {
		
	}

	$scope.doDelete = function (customerId) {
		
	}
})