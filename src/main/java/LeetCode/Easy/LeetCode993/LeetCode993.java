package LeetCode.Easy.LeetCode993;

/**
 * @ClassName LeetCode993
 * @Description TODO
 * @Author point
 * @Date 2023/8/15 23:47
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
    int x;

    int xLevel;

    int y;

    int yLevel;

    TreeNode xFather = new TreeNode();

    TreeNode yFather = new TreeNode();

    void DFS(TreeNode node, int level) {
        if (node == null) {
            return;
        }

        if (node.left != null) {
            if (node.left.val == x) {
                xLevel = level + 1;
                xFather = node;
            }
            if (node.left.val == y) {
                yLevel = level + 1;
                yFather = node;
            }

            DFS(node.left, level + 1);
        }
        if (node.right != null) {
            if (node.right.val == x) {
                xLevel = level + 1;
                xFather = node;
            }
            if (node.right.val == y) {
                yLevel = level + 1;
                yFather = node;
            }

            DFS(node.right, level + 1);
        }


    }

    public boolean isCousins(TreeNode root, int x, int y) {
        if (root.val == x || root.val == y) {
            return false;
        }

        this.x = x;
        this.y = y;
        DFS(root, 0);

        return xLevel == yLevel && xFather != yFather;
    }
}

public class LeetCode993 {
}
