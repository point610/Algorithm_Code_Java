package CodeTop.HW.HW1145;

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
    private int left;
    private int right;
    private int Y;
    private TreeNode XX;

    private void DFSleft(TreeNode node) {
        if (node == null) {
            return;
        }
        left++;
        DFSleft(node.left);
        DFSleft(node.right);
    }

    private void DFSright(TreeNode node) {
        if (node == null) {
            return;
        }
        right++;
        DFSright(node.left);
        DFSright(node.right);
    }


    private void DFSYY(TreeNode node, int x) {
        if (node == null) {
            return;
        }
        if (node.val == x) {
            XX = node;
            return;
        }

        Y++;
        DFSYY(node.left, x);
        DFSYY(node.right, x);
    }

    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        if (root.val == x) {
            DFSleft(root.left);
            DFSright(root.right);
            return left != right;
        }
        Y = 0;
        DFSYY(root, x);
        DFSleft(XX.left);
        DFSright(XX.right);

        return (left > right + Y) || (right > left + Y)||(Y>left+right);

    }
}

public class HW1145 {
}
