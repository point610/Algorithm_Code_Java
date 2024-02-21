package CodeTop.TX.TX236;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    List<TreeNode> ooo;
    List<TreeNode> ttt;
    boolean onedone;
    boolean twodone;

    private void findOne(TreeNode node, TreeNode one) {
        if (node == null || onedone) {
            return;
        }
        ooo.add(node);
        if (node.val == one.val) {
            onedone = true;
            return;
        }
        findOne(node.left, one);
        if (onedone) {
            return;
        }
        findOne(node.right, one);
        if (onedone) {
            return;
        }
        ooo.remove(ooo.size() - 1);
    }

    private void findTwo(TreeNode node, TreeNode two) {
        if (node == null || twodone) {
            return;
        }
        ttt.add(node);
        if (node.val == two.val) {
            twodone = true;
            return;
        }
        findTwo(node.left, two);
        if (twodone) {
            return;
        }
        findTwo(node.right, two);
        if (twodone) {
            return;
        }
        ttt.remove(ttt.size() - 1);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ooo = new ArrayList<>();
        ttt = new ArrayList<>();

        onedone = false;
        twodone = false;

        findOne(root, p);
        findTwo(root, q);

        int index = 0;
        while (true) {
            if (index >= ooo.size()) {
                return ooo.get(index - 1);
            }
            if (index >= ttt.size()) {
                return ttt.get(index - 1);
            }
            if (ooo.get(index) != ttt.get(index)) {
                return ooo.get(index - 1);
            }
            index++;
        }
    }
}

public class TX236 {
}
