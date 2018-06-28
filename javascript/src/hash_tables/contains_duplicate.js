/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
  var seen = {};
  for (var x = 0; x < nums.length; x++) {
    if (seen.hasOwnProperty(String(nums[x]))) {
      return true;
    }

    seen[String(nums[x])] = true;
  }

  return false;
};

/**
 * Interesting es6 solution found online.
 *
 * @param nums
 * @returns {boolean}
 */
var containsDuplicate2 = function (nums) {
  return new Set(nums).size !== nums.length
};