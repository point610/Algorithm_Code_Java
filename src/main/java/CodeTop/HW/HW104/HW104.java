package CodeTop.HW.HW104;

/**
 * @ClassName HW104
 * @Description TODO
 * @Author point
 * @Date 2023/12/24 15:32
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
    private int max = 0;


    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        DFS(root, 1);

        return max;
    }

    private void DFS(TreeNode node, int level) {
        if (node == null) {
            max = Math.max(max,level - 1);
            return;
        }
        DFS(node.left, level + 1);
        DFS(node.right, level + 1);
    }
}

public class HW104 {
}
