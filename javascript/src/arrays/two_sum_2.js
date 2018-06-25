/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(numbers, target) {
  var seen = {};

  for (var x = 0; x < numbers.length; x++) {
    var diff = target - numbers[x];
    if (seen.hasOwnProperty(diff.toString())) {
      return [seen[diff] + 1, x + 1];
    }

    seen[numbers[x].toString()] = x;
  }

  return [];
};