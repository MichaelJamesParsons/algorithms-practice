/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
  if (nums.length <= 1) {
    return nums.length;
  }

  var ptr = 0;
  for (var x = 1; x < nums.length; x++) {
    if (nums[x] !== nums[ptr]) {
      ptr++;
      nums[ptr] = nums[x];
    }
  }

  return ptr + 1;
};