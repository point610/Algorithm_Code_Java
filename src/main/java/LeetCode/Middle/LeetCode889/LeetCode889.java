package LeetCode.Middle.LeetCode889;

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
    private TreeNode DFS(int[] preorder, int ll, int rr, int[] postorder, int lll, int rrr) {
        if (ll > rr) {
            return null;
        }
        if (ll == rr) {
            return new TreeNode(preorder[ll]);
        }

        TreeNode node = new TreeNode(preorder[ll]);

        // 找分界线
        int iivalue = postorder[rrr - 1];
        int iiindex = 0;
        for (int i = ll; i <= rr; i++) {
            if (preorder[i] == iivalue) {
                iiindex = i;
                break;
            }
        }

        int leftnumber = iiindex - 1 - (ll + 1) + 1;
        int rightnumber = rr - iiindex + 1;

        node.left = DFS(preorder, ll + 1, iiindex - 1, postorder, lll, lll + leftnumber - 1);
        node.right = DFS(preorder, iiindex, rr, postorder, rrr - 1 - rightnumber + 1, rrr - 1);

        return node;
    }

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return DFS(preorder, 0, preorder.length - 1, postorder, 0, postorder.length - 1);
    }
}

public class LeetCode889 {
}
