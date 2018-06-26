/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
  if (nums.length === 0) {
    return;
  }

  var result = [];
  var nextIndex;
  for (var x = 0; x < nums.length; x++) {
    nextIndex = (x + k) % nums.length;
    result[nextIndex] = nums[x];
  }

  result.forEach(function (num, i) {
    nums[i] = num;
  });
};

/**
 * An optimized solution found online.
 *
 * @param nums
 * @param k
 */
var rotate2 = function (nums, k) {
  var toPrepend = nums.splice(nums.length - k, k);
  nums.unshift(...toPrepend);
};