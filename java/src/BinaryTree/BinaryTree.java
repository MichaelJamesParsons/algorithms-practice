package BinaryTree;

import java.util.ArrayDeque;
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

    public List<Integer> postorderTraversal(TreeNode root) {
        return postorderTraversal(root, new ArrayList<Integer>());
    }

    public List<Integer> postorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return list;
        }

        postorderTraversal(root.left, list);
        postorderTraversal(root.right, list);
        list.add(root.val);

        return list;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        if (root == null) {
            return list;
        }

        List<Integer> initialList = new ArrayList<Integer>();
        initialList.add(root.val);
        list.add(initialList);
        q.add(root);

        while(!q.isEmpty()) {
            List<Integer> nList = new ArrayList<Integer>();
            ArrayDeque<TreeNode> q2 = new ArrayDeque<>();

            // Iterate over the nodes in a row
            while(!q.isEmpty()) {
                TreeNode n = q.pop();

                if (n.left != null) {
                    q2.add(n.left);
                    nList.add(n.left.val);
                }

                if (n.right != null) {
                    q2.add(n.right);
                    nList.add(n.right.val);
                }
            }

            if (!nList.isEmpty()) {
                list.add(nList);
            }

            q = q2;
        }

        return list;
    }
}