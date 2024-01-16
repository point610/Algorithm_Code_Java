package LeetCode.Easy.LeetCode257;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode257
 * @Description TODO
 * @Author point
 * @Date 2023/7/14 21:21
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
    List<String> res = new ArrayList<>();

    void findLeave(TreeNode node, String str) {

        if (node.left == null && node.right == null) {
            res.add(str + "->" + String.valueOf(node.val));
            return;
        }
        if (node.left != null) {
            findLeave(node.left, str + "->" + String.valueOf(node.val));
        }
        if (node.right != null) {
            findLeave(node.right, str + "->" + String.valueOf(node.val));
        }


    }

    public List<String> binaryTreePaths(TreeNode root) {
        if (root.left == null && root.right == null) {
            res.add(String.valueOf(root.val));
            return res;
        }
        if (root.left != null) {
            findLeave(root.left, String.valueOf(root.val));
        }
        if (root.right != null) {
            findLeave(root.right, String.valueOf(root.val));
        }
        return res;
    }
}

public class LeetCode257 {
    public static void main(String[] args) {

        Solution solution = new Solution();
    }
}
