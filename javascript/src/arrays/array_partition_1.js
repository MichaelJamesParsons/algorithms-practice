/**
 * @param {number[]} nums
 * @return {number}
 */
var arrayPairSum = function(nums) {
  var sum = 0;

  if (nums.length === 0) {
    return sum;
  }

  // JS uses lexicographical order by default.
  // Sort by numeric difference instead.
  nums.sort(function(a, b) {
    return a - b;
  });

  for (var x = 0; x <= nums.length - 1; x += 2) {
    sum += nums[x];
  }

  return sum;
};