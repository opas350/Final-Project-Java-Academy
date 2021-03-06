angular.module('app.services', []).factory('User', function($resource) {
  return $resource('/api/v1/users/:id', { id: '@id' }, {
    update: {
      method: 'PUT'
    }
  });
}).service('popupService',function($window){
    this.showPopup=function(message){
        return $window.confirm(message);
    }
});
