package CodeTop.TX.TX108;

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
    public TreeNode sortedArrayToBST(int[] nums) {
        return DFS(nums, 0, nums.length - 1);
    }

    private TreeNode DFS(int[] arr, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(arr[mid]);

        node.left = DFS(arr, left, mid - 1);
        node.right = DFS(arr, mid + 1, right);

        return node;
    }
}

public class TX108 {
}
