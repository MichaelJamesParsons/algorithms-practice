/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
  var maxCount = 0;
  var count = 0;

  nums.forEach(function (num) {
    if (num !== 1) {
      if (count > maxCount) {
        maxCount = count;
      }

      count = 0;
    } else {
      count++;
    }
  });

  if (count > maxCount) {
    maxCount = count;
  }

  return maxCount;
};