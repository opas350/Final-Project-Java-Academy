angular.module('app.controllers', []).controller('UserListController', function($scope, $state, popupService, $window, User) {
  $scope.users = User.query(); //fetch all users on the db. Issues a GET to /api/vi/users

  $scope.deleteUser = function(user) { // Delete a User. Issues a DELETE to /api/v1/users/:id
    if (popupService.showPopup('You sure?')) {
      user.$delete(function() {
        $scope.users = User.query(); 
        $state.go('users');
      });
    }
  };
}).controller('UserViewController', function($scope, $stateParams, User) {
  $scope.user = User.get({ id: $stateParams.id }); //Get a especifi user.Issues a GET to /api/v1/users/:id
}).controller('UserCreateController', function($scope, $state, $stateParams, User) {
  $scope.user = new User();  //create new user instance. Properties will be set via ng-model on UI

  $scope.addUser = function() { //create a new user. Issues a POST to /api/v1/users
    $scope.user.$save(function() {
      $state.go('users'); // on success go back to the list i.e. users state.
    });
  };
}).controller('UserEditController', function($scope, $state, $stateParams, User) {
  $scope.updateUser = function() { //Update the edited user. Issues a PUT to /api/v1/users/:id
    $scope.user.$update(function() {
      $state.go('users'); // on success go back to the list i.e. users state.
    });
  };

  $scope.loadUser = function() { //Issues a GET request to /api/v1/users/:id to get a user to update
    $scope.user = User.get({ id: $stateParams.id });
  };

  $scope.loadUser(); // Load a user which can be edited on UI
});
