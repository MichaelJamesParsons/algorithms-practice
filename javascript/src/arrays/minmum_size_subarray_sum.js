/**
 * @param {number} s
 * @param {number[]} nums
 * @return {number}
 */
var minSubArrayLen = function(s, nums) {
  var minLength = Number.MAX_VALUE;
  var sum = 0;
  var start = 0;
  var end = 0;

  while (start < nums.length && end <= nums.length) {
    if (sum < s) {
      sum += nums[end];
      end++;
    } else {
      if (end - start < minLength) {
        minLength = end - start;
      }

      sum -= nums[start];
      start++;
    }
  }

  return (minLength === Number.MAX_VALUE) ? 0 : minLength;
};