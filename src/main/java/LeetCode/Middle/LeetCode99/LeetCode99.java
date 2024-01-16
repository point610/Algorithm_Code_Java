package LeetCode.Middle.LeetCode99;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName LeetCode99
 * @Description TODO
 * @Author point
 * @Date 2023/11/6 23:29
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

    int index = 0;

    void DFS(TreeNode node) {
        if (node == null) {
            return;
        }
        DFS(node.left);
        list.add(node.val);
        DFS(node.right);
    }

    void ADDDFS(TreeNode node) {
        if (node == null) {
            return;
        }
        ADDDFS(node.left);
        node.val = list.get(index++);
        ADDDFS(node.right);
    }

    public void recoverTree(TreeNode root) {
        DFS(root);
        Collections.sort(list);
        ADDDFS(root);
    }
}

public class LeetCode99 {
}
