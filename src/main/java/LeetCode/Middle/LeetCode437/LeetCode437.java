package LeetCode.Middle.LeetCode437;

/**
 * @ClassName LeetCode437
 * @Description TODO
 * @Author point
 * @Date 2023/11/18 23:34
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
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return calPathSum(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    private int calPathSum(TreeNode root, long sum) {
        if (root == null) {
            return 0;
        }
        int tmp = 0;
        sum -= root.val;
        if (sum == 0) {
            tmp++;
        }
        return tmp + calPathSum(root.left, sum) + calPathSum(root.right, sum);
    }
}



public class LeetCode437 {
}
