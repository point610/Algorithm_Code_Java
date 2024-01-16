package CodeTop.HW.HW226;

/**
 * @ClassName HW226
 * @Description TODO
 * @Author point
 * @Date 2023/12/24 15:10
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
    public TreeNode invertTree(TreeNode root) {
        DFS(root);
        return root;
    }

    private void DFS(TreeNode node) {
        if (node == null) {
            return;
        }

        TreeNode temp = node.left;

        node.left = node.right;
        node.right = temp;
        DFS(node.left);
        DFS(node.right);

    }
}

public class HW226 {
}
