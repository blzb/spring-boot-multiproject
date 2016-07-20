function Sample1Sub2Ctrl($scope) {
  console.log('Sample1Sub2Ctrl');
}

angular
  .module('core.ejemplo1.sub2', [])
  .controller('Sample1Sub2Ctrl', Sample1Sub2Ctrl);
  