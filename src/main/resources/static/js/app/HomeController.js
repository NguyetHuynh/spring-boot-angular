angular.module('mainApp', [])
.controller('homeController', function ($scope, $http) {
    $http.get('api/listsongs').then(function getSuccess(response) {
        $scope.songs = response;
    }, function hasError(reason) {
        $scope.songs = reason;
    })
})
