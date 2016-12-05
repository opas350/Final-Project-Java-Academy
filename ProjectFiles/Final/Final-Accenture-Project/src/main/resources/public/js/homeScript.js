(function() {

var app = angular.module("app", []);

var MainController = function($scope) {


function getParameterByName(name) {

var match = RegExp('[?&]' + name + '=([^&]*)').exec(window.location.search);
//	console.log(match);
//	console.log(decodeURIComponent(match[1].replace(/\+/g, ' ')));
    return match && decodeURIComponent(match[1].replace(/\+/g, ' '));
}

var User_1 = getParameterByName('first'); // name of user1
$scope.firstName = User_1;

var User_2 = getParameterByName('last'); // name of user2
$scope.lastName = User_2;

//console.log(User_1);
//console.log(User_2);
};

app.controller("MainController", MainController);
}());
