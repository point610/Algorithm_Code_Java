package LeetCode.Easy.LeetCode2236;

/**
 * @ClassName LeetCode2236
 * @Description TODO
 * @Author point
 * @Date 2023/8/20 0:31
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
    public boolean checkTree(TreeNode root) {
        return root.val == (root.left.val + root.right.val);
    }
}

public class LeetCode2236 {
}
