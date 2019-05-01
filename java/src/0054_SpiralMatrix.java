import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of
 * the matrix in spiral order.
 *
 * @see <a href="https://leetcode.com/problems/spiral-matrix/">LeetCode</a>
 */
class Solution {
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> spiral = new ArrayList<>();

    if (matrix.length == 0 || matrix[0].length == 0) {
      return spiral;
    }

    int top = 0;
    int bottom = matrix.length - 1;
    int left = 0;
    int right = matrix[0].length - 1;

    while (top <= bottom && left <= right) {
      // Top
      for (int t = left; t <= right; t++) {
        spiral.add(matrix[top][t]);
      }
      top++;

      // Right
      for (int r = top; r <= bottom; r++) {
        spiral.add(matrix[r][right]);
      }
      right--;

      if (top <= bottom) {
        for (int b = right; b >= left; b--) {
          spiral.add(matrix[bottom][b]);
        }
        bottom--;
      }

      if (left <= right) {
        for(int l = bottom; l >= top; l--) {
          spiral.add(matrix[l][left]);
        }
        left++;
      }
    }

    return spiral;
  }
}
