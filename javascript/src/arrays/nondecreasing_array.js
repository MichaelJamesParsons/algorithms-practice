/**
 * @param {number[]} nums
 * @return {boolean}
 */
var checkPossibility = function(nums) {
  var numDecreasing = 0;
  var prevNum = null;
  var prevNum2 = null;
  return nums.every(function (num) {
    if ((prevNum !== null && prevNum > num)) {
      numDecreasing++;

      if (prevNum2 !== null && prevNum2 > num) {
        numDecreasing++;
      }
    }

    prevNum2 = prevNum;
    prevNum = num;
    return numDecreasing <= 1;
  })
};