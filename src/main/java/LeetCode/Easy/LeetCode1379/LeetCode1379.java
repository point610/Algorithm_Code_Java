package LeetCode.Easy.LeetCode1379;

/**
 * @ClassName LeetCode1379
 * @Description TODO
 * @Author point
 * @Date 2023/9/18 21:56
 * @Version 1.0
 */

class TreeNode {
    int val;

    TreeNode left;

    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


class Solution {
    TreeNode res = null;

    void DFS(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) {
            return;
        }
        if (original.val == target.val) {
            res = cloned;
            return;
        }
        getTargetCopy(original.left, cloned.left, target);
        getTargetCopy(original.right, cloned.right, target);

    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        DFS(original, cloned, target);
        return res;
    }
}

public class LeetCode1379 {
}
