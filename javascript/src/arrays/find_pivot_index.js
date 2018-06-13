/**
 * @param {number[]} nums
 * @return {number}
 */
var pivotIndex = function(nums) {
    if (nums.length <= 2) {
        return -1;
    }

    var left = 0;
    var right = nums.length - 1;
    var leftSum = 0;
    var rightSum = 0;

    while (left < right) {
        while (leftSum <= rightSum && left < right) {
            leftSum += nums[left];
            left++;
        }

        while (rightSum <= leftSum && right > left) {
            rightSum += nums[right];
            right++;
        }
    }

    if (left === right && leftSum === rightSum) {
        return left;
    }

    return -1;
};