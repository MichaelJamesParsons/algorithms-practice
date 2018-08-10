/**
 * @param {number[]} temperatures
 * @return {number[]}
 */
var dailyTemperatures = function(temperatures) {
  var stack = [];
  var results = new Array(temperatures.length).fill(0);

  for (var x = 0; x < temperatures.length; x++) {
    while (stack.length > 0 && temperatures[stack[stack.length - 1]] < temperatures[x]) {
      var value = stack.pop()
      results[value] = x - value;
    }

    stack.push(x);
  }

  return results;
};
