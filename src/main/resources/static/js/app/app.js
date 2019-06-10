angular.module('mainApp', ['ui.router', 'ngMaterial', 'ngMessages', 'songlist'])
    .run(function () {
        console.log('App running');
    })
    .config(function ($stateProvider, $urlRouterProvider) {
        var listSongState = {
            name: 'home',
            url: '/home',
            template: '<div>hello world</div>'
        }

        $stateProvider.state(listSongState);
        $urlRouterProvider.otherwise('/home');

    })
