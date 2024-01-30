package CodeTop.HW.HW236;

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
    private List<TreeNode> one;
    private List<TreeNode> two;
    private boolean find;

    private void DFS(TreeNode node, boolean o, int target) {
        if (node == null || find) {
            return;
        }
        if (node.val == target) {
            if (o) {
                one.add(node);
            } else {
                two.add(node);
            }
            find = true;
            return;
        }
        if (o) {
            one.add(node);
        } else {
            two.add(node);
        }

        DFS(node.left, o, target);
        if (find) {
            return;
        }
        DFS(node.right, o, target);
        if (find) {
            return;
        }

        if (o) {
            one.remove(one.size() - 1);
        } else {
            two.remove(two.size() - 1);
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        one = new ArrayList<>();
        two = new ArrayList<>();

        find = false;
        DFS(root, true, p.val);
        find = false;
        DFS(root, false, q.val);


        for (int i = one.size() - 1; i >= 0; i--) {
            for (int j = two.size() - 1; j >= 0; j--) {
                if (one.get(i) == two.get(j)) {
                    return one.get(i);
                }
            }
        }
        return one.get(0);
    }
}

public class HW236 {
}

