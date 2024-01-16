package LeetCode.Easy.LCR174;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName LCR174
 * @Description TODO
 * @Author point
 * @Date 2023/10/9 22:37
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
    List<Integer> list = new ArrayList<>();

    void DFS(TreeNode node) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        DFS(node.left);
        DFS(node.right);
    }

    public int findTargetNode(TreeNode root, int cnt) {
        DFS(root);
        Collections.sort(list);
        return list.get(list.size() - cnt);
    }
}

public class LCR174 {
}
