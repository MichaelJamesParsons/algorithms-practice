import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative integer numRows, generate the first numRows of Pascal's
 * triangle.
 *
 * @see <a href="https://leetcode.com/problems/pascals-triangle/">Leetcode</a>
 */
class Solution {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> triangle = new ArrayList<>();

    if (numRows == 0) {
      return new ArrayList<>();
    }

    triangle.add(new ArrayList<>());
    triangle.get(0).add(1);

    for (int x = 1; x < numRows; x++) {
      triangle.add(new ArrayList<>());
      triangle.get(x).add(1);

      for (int j = 1; j < triangle.get(x - 1).size(); j++) {
        triangle.get(x).add(
            triangle.get(x - 1).get(j - 1) + triangle.get(x - 1).get(j));
      }

      triangle.get(x).add(1);
    }

    return triangle;
  }
}
