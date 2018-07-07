/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function(nums, k) {
  var map = {};

  nums.forEach(function (num) {
    map[num] = map[num] + 1 || 1;
  });

  var keys = Object.keys(map);
  keys.sort(function (num1, num2) {
    if (map[num1] > map[num2]) {
      return -1;
    } else {
      return 1;
    }
  });

  var results = [];
  for (var x = 0; x < k; x++) {
    results.push(parseInt(keys[x]));
  }

  return results;
};