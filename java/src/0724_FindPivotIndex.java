/**
 * Given an array of integers nums, write a method that returns the "pivot"
 * index of this array.
 *
 * We define the pivot index as the index where the sum of the numbers to the
 * left of the index is equal to the sum of the numbers to the right of the
 * index.
 *
 * If no such index exists, we should return -1. If there are multiple pivot
 * indexes, you should return the left-most pivot index.
 *
 * @see <a href="https://leetcode.com/problems/find-pivot-index/">LeetCode</a>
 */
class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0, pivotIndex = 0, pivotSum = 0;
        if (nums.length == 1) {
            return 0;
        }

        for(int num : nums) {
            totalSum += num;
        }

        while (pivotIndex < nums.length) {
            if ((float)(totalSum - nums[pivotIndex]) / 2 == pivotSum) {
                return pivotIndex;
            }

            pivotSum += nums[pivotIndex];
            pivotIndex++;
        }

        return -1;
    }
}
