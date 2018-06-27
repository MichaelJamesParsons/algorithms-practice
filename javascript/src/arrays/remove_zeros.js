/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
  if (nums.length <= 1) {
    return;
  }

  var ptr = 0;
  for (var x = 0; x < nums.length; x++) {
    if (nums[x] !== 0) {
      nums[ptr] = nums[x];
      ptr++;
    }
  }

  while (ptr < nums.length) {
    nums[ptr] = 0;
    ptr++;
  }
};