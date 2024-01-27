package CodeTop.HW.HW105;

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
    private TreeNode DFS(int[] pre, int pl, int pr, int[] in, int il, int ir) {
        if (pl >= pr || il >= ir) {
            if (pl == pr) {
                return new TreeNode(pre[pl]);
            }
            return null;
        }

        TreeNode root = new TreeNode(pre[pl]);

        int temp = pre[pl];
        int index = -1;
        for (int i = il; i <= ir; i++) {
            if (in[i] == temp) {
                index = i;
                break;
            }
        }

        int leftNumber = index - il;
        int rightNumber = ir - index;

        // 左
        root.left = DFS(pre, pl + 1, pl + leftNumber, in, il, index - 1);
        // 右
        root.right = DFS(pre, pl + leftNumber + 1, pr, in, index + 1, ir);

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = DFS(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        return root;
    }
}

public class HW105 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7}));
    }
}
