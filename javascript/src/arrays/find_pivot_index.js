/**
 * @param {number[]} nums
 * @return {number}
 */
var pivotIndex = function (nums) {
    if (nums.length === 0) {
        return -1;
    }

    var pivotIndex = 0;
    var left, right, leftSum, rightSum;
    while (pivotIndex < nums.length) {
        left = right = pivotIndex;
        leftSum = rightSum = 0;

        while (left > 0) {
            left--;
            leftSum += nums[left];
        }

        while (right < nums.length - 1) {
            right++;
            rightSum += nums[right];
        }

        if (leftSum === rightSum) {
            return pivotIndex;
        }

        pivotIndex++;
    }

    return -1;
};