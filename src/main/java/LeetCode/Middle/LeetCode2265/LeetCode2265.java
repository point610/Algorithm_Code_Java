package LeetCode.Middle.LeetCode2265;

/**
 * @ClassName LeetCode2265
 * @Description TODO
 * @Author point
 * @Date 2023/8/12 15:34
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

    int count = 0;

    public int averageOfSubtree(TreeNode root) {
        DFS(root);
        return count;
    }

    private int[] DFS(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }

        int[] left = DFS(node.left);
        int[] right = DFS(node.right);

        int sum = left[0] + right[0] + node.val;
        int tempcount = left[1] + right[1] + 1;

        if (node.val == sum / tempcount) {
            count++;
        }
        return new int[]{sum, tempcount};
    }
}

public class LeetCode2265 {


}
