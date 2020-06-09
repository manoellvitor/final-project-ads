'use strict';

var app = angular.module('app', ['ngRoute']);

app.config(['$routeProvider', function($routeProvider) {
	
	$routeProvider.when('/', {
			templateUrl: 'static/views/home.html'
		})

		.when('/aluno/novo', {
			templateUrl: 'static/views/cadastro_aluno.html',
			controller: 'AlunoCtrl'
		})

		.otherwise({redirectTo: '/'});
}]);


