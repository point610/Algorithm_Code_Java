package LeetCode.Middle.LeetCode95;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode95
 * @Description TODO
 * @Author point
 * @Date 2023/10/30 22:57
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
    List<TreeNode> DFS(int left, int right) {
        if (left > right) {
            return new ArrayList<TreeNode>() {{
                add(null);
            }};
        }

        List<TreeNode> nodes = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            for (TreeNode ll : DFS(left, i - 1)) {
                for (TreeNode rr : DFS(i + 1, right)) {
                    TreeNode root = new TreeNode(i);
                    root.left = ll;
                    root.right = rr;
                    nodes.add(root);
                }
            }
        }
        return nodes;
    }


    public List<TreeNode> generateTrees(int n) {
        return DFS(1, n);
    }
}

public class LeetCode95 {
}
