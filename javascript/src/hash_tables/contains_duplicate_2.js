/**
 * @param {number[]} nums
 * @param {number} k
 * @return {boolean}
 */
var containsNearbyDuplicate = function(nums, k) {
  var map = {};
  var num;

  for (var x = 0; x < nums.length; x++) {
    num = nums[x];

    if (!map.hasOwnProperty(num) || (x - map[num]) > k) {
      map[num] = x;
    } else {
      return true;
    }
  }

  return false;
};