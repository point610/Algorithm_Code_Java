package CodeTop.HW.HW654;

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
    private int index = 0;
    private int max = 0;

    private int getmax(int[] ll, int left, int right) {
        for (int i = left; i <= right; i++) {
            if (max < ll[i]) {
                max = ll[i];
                index = i;
            }
        }
        return max;
    }

    private TreeNode DFS(int[] aaa, int left, int right) {
        if (left > right) {
            return null;
        }
        if (left == right) {
            return new TreeNode(aaa[left]);
        }
        max = 0;
        getmax(aaa, left, right);
        int ll = left;
        int lr = index - 1;
        int rl = index + 1;
        int rr = right;

        TreeNode node = new TreeNode(max);
        node.left = DFS(aaa, ll, lr);
        node.right = DFS(aaa, rl, rr);

        return node;
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root = DFS(nums, 0, nums.length - 1);

        return root;

    }
}

public class HW654 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5});
    }
}
