/**
 * Hashmap solution
 *
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
  var seen = {};
  for (var x = 0; x < nums.length; x++) {
    if (seen.hasOwnProperty(String(nums[x]))) {
      delete seen[String(nums[x])];
    } else {
      seen[nums[x]] = x;
    }
  }

  return parseInt(Object.keys(seen)[0]);
};

/**
 * A more optimal solution than using a hashmap.
 * @param nums
 * @returns {*}
 */
var singleNumber2 = function (nums) {
  return nums.reduce(function (val, num) {
    return val ^ num
  }, 0);
};