/**
 * In a given integer array nums, there is always exactly one largest element.
 *
 * Find whether the largest element in the array is at least twice as much as every other number in the array.
 *
 * If it is, return the index of the largest element, otherwise return -1.
 * @param {number[]} nums
 * @return {number}
 */
var dominantIndex = function(nums) {
    if (nums.length === 0) {
        return -1;
    } else if (nums.length === 1) {
        return 0;
    }

    var largestNumIndex = 0;
    var secondLargestIndex = null;

    for (var x = 1; x < nums.length; x++) {
        if (nums[x] > nums[largestNumIndex]) {
            secondLargestIndex = largestNumIndex;
            largestNumIndex = x;
        }
    }

    if (nums[secondLargestIndex] !== 0 && nums[largestNumIndex] > 2 * nums[secondLargestIndex]) {
        return largestNumIndex;
    }

    return -1;
};