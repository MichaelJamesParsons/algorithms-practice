/**
 * Given a non-empty array of digits representing a non-negative integer, plus
 * one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of
 * the list, and each element in the array contain a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the
 * number 0 itself.
 *
 * @see <a href="https://leetcode.com/problems/plus-one/">LeetCode</a>
 */
class Solution {
  public int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        digits[i] += 1;
        return digits;
      }

      digits[i] = 0;
    }

    int[] nextNumber = new int[digits.length + 1];
    nextNumber[0] = 1;
    return nextNumber;
  }
}
