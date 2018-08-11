/**
 * @param {number[]} nums
 * @param {number} S
 * @return {number}
 */
var findTargetSumWays = function(nums, S) {
  var map = new Map();
  return traverse(nums, S, nums.length - 1, map).total
};

var traverse = function (nums, S, index, map) {
  if (index === 0) {
    return { key: nums[index] + '', target: 0, total: nums[index] };
  }

  var positive = traverse(nums, S, index - 1, map);
  positive.key += nums[index];
  positive.total += nums[index];

  var negative = traverse(nums, S, index - 1, map);
  negative.key += '-' + nums[index];
  negative.key += 1 * nums[index];

  return positive.total + negative.total;
}