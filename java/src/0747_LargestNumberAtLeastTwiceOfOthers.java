/**
 * In a given integer array nums, there is always exactly one largest element.
 *
 * Find whether the largest element in the array is at least twice as much as
 * every other number in the array.
 *
 * If it is, return the index of the largest element, otherwise return -1.
 */
class Solution {
  public int dominantIndex(int[] nums) {
    if (nums.length == 1) {
      return 0;
    }

    int maxIndex = 0;
    int nextIndex = -1;
    for(int i = 1; i < nums.length; i++) {
      if (nums[i] > nums[maxIndex]) {
        nextIndex = maxIndex;
        maxIndex = i;
      } else if (nextIndex == -1 || nums[i] > nums[nextIndex]) {
        nextIndex = i;
      }
    }

    if (nums[nextIndex] * 2 <= nums[maxIndex]) {
      return maxIndex;
    }

    return -1;
  }
}
