package CodeTop.HW.HW450;

/**
 * @ClassName HW450
 * @Description TODO
 * @Author point
 * @Date 2023/12/30 21:50
 * @Version 1.0
 */
class TreeNode {
    int val;

    TreeNode left;

    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    int key;

    void DFS(TreeNode node, TreeNode father, boolean lll) {
        if (node == null) {
            return;
        }
        if (node.val != key) {
            DFS(node.left, node, true);
            DFS(node.right, node, false);
            return;
        }

        TreeNode left = node.left;
        TreeNode right = node.right;


        if (left == null && right == null) {
            if (lll) {
                father.left = null;
            } else {
                father.right = null;
            }
            return;
        }
        if (left == null) {
            if (lll) {
                father.left = right;
            } else {
                father.right = right;
            }
            return;
        }
        if (right == null) {
            if (lll) {
                father.left = left;
            } else {
                father.right = left;
            }
            return;
        }

        TreeNode temp = left;
        while (temp.right != null) {
            temp = temp.right;
        }
        temp.right = right;
        if (lll) {
            father.left = left;
        } else {
            father.right = left;
        }

    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
        this.key = key;
        TreeNode father = new TreeNode();
        if (root.val > key) {
            DFS(root.left, root, true);
            return root;
        } else if (root.val < key) {
            DFS(root.right, root, false);
            return root;
        } else {
            TreeNode left = root.left;
            TreeNode right = root.right;

            if (left == null && right == null) {
                return null;
            }
            if (left == null) {
                return right;
            }
            if (right == null) {
                return left;
            }

            TreeNode temp = left;
            while (temp.right != null) {
                temp = temp.right;
            }
            temp.right = right;
            return left;
        }

    }
}

public class HW450 {
}
