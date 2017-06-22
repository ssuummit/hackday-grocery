var app = angular.module('app', ['ngRoute','ngResource']);

app.config(function($routeProvider) {
    $routeProvider

        .when('/', {
            templateUrl : '/views/homepage.html',
            controller  : 'mainController'
        })
        .when('/orderDetails', {
            templateUrl : '/views/order_details.html',
            controller  : 'orderDetailsController'
        })
        .when('/nextOrderDetails', {
            templateUrl : '/views/unfulfilled_order_details.html',
            controller  : 'unfulfilledOrderDetailsController'
        });
});