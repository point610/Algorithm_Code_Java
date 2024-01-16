package LeetCode.Easy.LeetCode872;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode872
 * @Description TODO
 * @Author point
 * @Date 2023/8/12 13:28
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
    List<Integer> one = new ArrayList<>();

    List<Integer> two = new ArrayList<>();

    void DFSOne(TreeNode node) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            one.add(node.val);
        }
        DFSOne(node.left);
        DFSOne(node.right);
    }

    void DFSTwo(TreeNode node) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            two.add(node.val);
        }
        DFSTwo(node.left);
        DFSTwo(node.right);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        DFSOne(root1);
        DFSTwo(root2);
        int size = one.size();
        if (size != two.size()) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (one.get(i) != two.get(i)) {
                return false;
            }
        }
        return true;
    }
}

public class LeetCode872 {
}
