/**
 * @param {number[]} nums
 * @return {number}
 */
var pivotIndex = function (nums) {
    var sum = 0;
    for (var x = 0; x < nums.length; x++) {
        sum += nums[x];
    }

    var leftSum = 0;
    for (var x = 0; x < nums.length; x++) {
        if (leftSum === (sum - leftSum - nums[x])) {
            return x;
        }

        leftSum += nums[x];
    }

    return -1;
};