angular.module('songlist')
.component('songList', {
    templateUrl: '../../templates/listSongs',
    controller: function ($scope, $http) {
        // var self = this;
        // $http.get('api/listsongs').then(function (response) {
        //     self.songs = response;
        // })

        $http.get('api/listsongs').then(function getSuccess(response) {
            $scope.songs = response;
        }, function hasError(reason) {
            $scope.songs = reason;
        })
    }
});