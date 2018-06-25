/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
  if (nums.length === 0) {
    return 0;
  }

  var ptr = 0;

  for (var x = 0; x < nums.length; x++) {
    if (nums[x] !== val) {
      nums[ptr] = nums[x];
      ptr++;
    }
  }

  return ptr;
};