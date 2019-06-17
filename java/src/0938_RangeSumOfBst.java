class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
  public int rangeSumBST(TreeNode root, int L, int R) {
    int sum = 0;

    if (root != null) {
      if (root.val >= L && root.val <= R) {
        sum += root.val;
      }

      if (root.val >= L) {
        sum += rangeSumBST(root.left, L, R);
      }

      if (root.val <= R) {
        sum += rangeSumBST(root.right, L, R);
      }
    }

    return sum;
  }
}
