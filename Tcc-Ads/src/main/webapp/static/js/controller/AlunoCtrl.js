'use strict';

angular.module('app')

	.controller('AlunoCtrl', ['$scope', 'UtilHttpConnection', function($scope, UtilHttpConnection) {
		
		$scope.aluno = {
			id: 1
		};

		$scope.salvar = function() {
			UtilHttpConnection.post('/alunoController/salvar', $scope.aluno);
		};
	}]);	