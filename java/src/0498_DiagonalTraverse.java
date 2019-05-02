/**
 * Given a matrix of M x N elements (M rows, N columns), return all elements of
 * the matrix in diagonal order as shown in the below image.
 *
 * @see <a href="https://leetcode.com/problems/diagonal-traverse/">LeetCode</a>
 *
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 *
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 * ]
 *
 * [
 *  [ 1, 2 ],
 *  [ 4, 5 ],
 *  [ 7, 8 ]
 * ]
 *
 * 1    2,4   7,5,3   6,8,9
 */
class Solution {
  public int[] findDiagonalOrder(int[][] matrix) {
    if (matrix.length == 0) {
      return new int[0];
    }

    boolean isUp = true;
    int row = 0;
    int column = 0;
    int total = matrix.length * matrix[0].length;
    int[] result = new int[total];
    while (result.length <= total) {
      // Going up
      for (int d = matrix.length; d > 0; d--) {
        System.out.println(matrix[d][matrix.length - d]);
      }

      // Going down
      for (int d = 0; d < matrix.length; d++) {
        System.out.println(matrix[d][matrix.length - (matrix.length - d) - 1]);
      }
    }
  }
}
