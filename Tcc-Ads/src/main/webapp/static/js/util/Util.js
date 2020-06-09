'use strict';

angular.module('app')
	.factory('UtilHttpConnection', ['$http', function($http) {
		var URL_PREFIX = '/PITCC';
		var httpMethods = {};
		
		console.log(URL_PREFIX);
		
		httpMethods.post = function(url, obj) {
			$http.post(URL_PREFIX + url, obj);
		};
		
		httpMethods.get = function(url) {
			return $http.get(URL_PREFIX + url);
		};
		
		httpMethods.put = function(url, obj) {
			return $http.put(URL_PREFIX + url, obj);
		};
		
		return httpMethods;
	}]);