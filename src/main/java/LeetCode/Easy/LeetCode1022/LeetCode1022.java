package LeetCode.Easy.LeetCode1022;

/**
 * @ClassName LeetCode1022
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 16:08
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
    int allSum = 0;

    void DFS(TreeNode node, int sum) {
        if (node == null) {
            return;
        }

        sum *= 2;
        sum += node.val;
        if (node.left == null && node.right == null) {
            // 叶子结点
            allSum += sum;
            return;
        }
        DFS(node.left, sum);
        DFS(node.right, sum);
    }

    public int sumRootToLeaf(TreeNode root) {
DFS(root,0);
return allSum;

    }
}

public class LeetCode1022 {
}
