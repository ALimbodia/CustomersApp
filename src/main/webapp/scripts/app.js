var app = angular.module('cyberTest', ["ngRoute"]);

app.config(function ($routeProvider) {
	$routeProvider.
		when('/', {
			templateUrl: 'views/list.html',
			controller: 'displayController'
		})
		.when('/update', {
			templateUrl: 'views/update.html',
			controller: 'displayController'
		})
		.otherwise({ redirectTo: '/'});
});