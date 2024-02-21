package LeetCode.Middle.LeetCode106;

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
    private TreeNode getroot(int[] inorder, int ll, int rr, int[] postorder, int lll, int rrr) {
        if (lll > rrr) {
            return null;
        }
        int currentvalue = postorder[rrr];
        TreeNode node = new TreeNode(currentvalue);

        // 中间值
        int ii = 0;
        for (int i = ll; i <= rr; i++) {
            if (inorder[i] == currentvalue) {
                ii = i;
                break;
            }
        }

        node.left = getroot(inorder, ll, ii - 1, postorder, lll, lll - 1 + (ii - ll));
        node.right = getroot(inorder, ii + 1, rr, postorder, rrr - (rr - ii), rrr - 1);

        return node;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return getroot(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }
}

public class LeetCode106 {
}
