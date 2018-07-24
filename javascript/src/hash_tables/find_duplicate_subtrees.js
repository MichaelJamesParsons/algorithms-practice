/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {TreeNode[]}
 */
var findDuplicateSubtrees = function(root) {
  var subtreeMap = {};
  findSubtrees(root, subtreeMap);

  return Object.keys(subtreeMap).reduce((duplicates, key) => {
    if (subtreeMap[key].count > 1) {
    duplicates.push(subtreeMap[key].head);
  }

  return duplicates;
}, []);
};

function findSubtrees (node, map) {
  if (node === null) {
    return 'null';
  }

  var left = findSubtrees(node.left, map);
  var right = findSubtrees(node.right, map);
  var key = '' + node.val + left + right;

  if (!map.hasOwnProperty(key)) {
    map[key] = { count: 1, head: node };
  } else {
    map[key].count++;
  }

  return key;
}
