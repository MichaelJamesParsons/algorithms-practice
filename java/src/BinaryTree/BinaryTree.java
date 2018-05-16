package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) { val = x; }
}

class BinaryTree {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();

        if (root == null) {
            return list;
        }

        s.push(root);

        do {
            TreeNode node = s.pop();

            if (node.right != null) {
                s.push(node.right);
            }

            if (node.left != null) {
                s.push(node.left);
            }

            list.add(node.val);
        } while(!s.empty());

        return list;
    }

    public List<Integer> preorderTraversal(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return list;
        }

        list.add(root.val);
        preorderTraversal(root.left, list);
        preorderTraversal(root.right, list);

        return list;
    }

    /**
     * @todo - Too slow...feels too complicated.
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();

        if (root == null) {
            return list;
        }

        s.push(root);

        while(!s.empty()) {
            TreeNode node = s.pop();

            while(node.left != null) {
                s.push(node);
                node = node.left;
            }

            list.add(node.val);

            if (node.right != null) {
               s.push(node.right);
            } else if(!s.empty()) {
                node = s.pop();
                list.add(node.val);

                if (node.right != null) {
                    s.push(node.right);
                }
            }
        }

        return list;
    }

    public void inorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }
}