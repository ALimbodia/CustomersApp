var app = angular.module('cyberTest', ["ngRoute"]);

app.config(function ($routeProvider) {
	$routeProvider.
		when('/', {
			templateUrl: 'views/list.html',
			controller: 'displayController'
		})
		.when('/update', {
			templateUrl: 'views/update.html',
			controller: 'updateController'
		})
		.when('/create', {
			templateUrl: 'views/createNew.html',
			controller: 'createController'
		})

		.otherwise({ redirectTo: '/'});
});