package LeetCode.Easy.LCR150;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LCR150
 * @Description TODO
 * @Author point
 * @Date 2023/10/9 17:34
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
    List<List<Integer>> list = new ArrayList<>();

    void DFS(TreeNode node, int level) {
        if (node == null) {
            return;
        }

        if (list.size() <= level) {
            list.add(new ArrayList<>());
        }

        list.get(level).add(node.val);
        DFS(node.left, level + 1);
        DFS(node.right, level + 1);
    }

    public List<List<Integer>> decorateRecord(TreeNode root) {
        DFS(root, 0);
        return list;
    }
}

public class LCR150 {
}
