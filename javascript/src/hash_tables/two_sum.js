/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
  var seen = {};
  for (var x = 0; x < nums.length; x++) {
    var diff = target - nums[x];
    if (seen.hasOwnProperty(String(diff))) {
      return [seen[diff], x];
    }

    seen[String(nums[x])] = x;
  }

  return null;
};