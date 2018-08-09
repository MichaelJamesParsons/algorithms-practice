var getNextIndex = function (n, dir, nums) {
  var r = (n + nums[n]) % nums.length;
  var mod = r < 0 ? r + nums.length : r;

  return n === mod || dir * nums[n] <= 0 ? null : mod;
}

/**
 * @param {number[]} nums
 * @return {boolean}
 */
var circularArrayLoop = function(nums) {
  var slow;
  var fast;
  var dir;

  for (var x = 0; x < nums.length; x++) {
    slow = x;
    fast = getNextIndex(getNextIndex(x, dir, nums), dir, nums);

    while (slow !== null && fast !== null && slow !== fast) {
      slow = getNextIndex(slow, dir, nums);
      fast = getNextIndex(getNextIndex(fast, dir, nums), dir, nums);
    }

    if (slow !== null && slow === fast) {
      return true
    }
  }

  return false;
};