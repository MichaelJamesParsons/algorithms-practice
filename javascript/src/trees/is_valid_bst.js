/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param min
 * @param max
 * @return {boolean}
 */
var isValidBST = function (root, min = null, max = null) {
  if (root === null) {
    return true;
  }

  if ((min !== null && root.val >= min) || (max !== null && root.val <= max)) {
    return false;
  }

  return isValidBST(root.left, root.val, max) && isValidBST(root.right, min, root.val);
};