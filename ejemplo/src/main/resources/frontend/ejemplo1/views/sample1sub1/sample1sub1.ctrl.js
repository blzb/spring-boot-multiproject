function Sample1Sub1Ctrl($scope) {
  console.log('Sample1Sub1Ctrl');
}

angular
  .module('core.ejemplo1.sub1', [])
  .controller('Sample1Sub1Ctrl', Sample1Sub1Ctrl);
