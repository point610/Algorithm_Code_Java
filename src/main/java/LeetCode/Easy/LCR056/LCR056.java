package LeetCode.Easy.LCR056;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LCR056
 * @Description TODO
 * @Author point
 * @Date 2023/10/7 22:12
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
        DFS(node.left);
        list.add(node.val);
        DFS(node.right);
    }

    public boolean findTarget(TreeNode root, int k) {
        DFS(root);
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            if ((list.get(left) + list.get(right)) == k) {
                return true;
            }
            if ((list.get(left) + list.get(right)) < k) {
                left++;
            }
            if ((list.get(left) + list.get(right)) > k) {
                right--;
            }


        }
        return false;


    }
}

public class LCR056 {
}
