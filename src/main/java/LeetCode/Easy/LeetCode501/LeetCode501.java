package LeetCode.Easy.LeetCode501;

import java.util.*;

/**
 * @ClassName LeetCode501
 * @Description TODO
 * @Author point
 * @Date 2023/8/3 23:20
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
    Map<Integer, Integer> hashMap = new HashMap<>();

    void DFS(TreeNode node) {
        if (node == null) {
            return;
        }
        hashMap.put(node.val, hashMap.getOrDefault(node.val, 0) + 1);
        DFS(node.left);
        DFS(node.right);
    }

    public int[] findMode(TreeNode root) {
        DFS(root);
        Integer max = -100000;
        for (Integer key : hashMap.keySet()) {
            if (max < hashMap.get(key)) {
                max = hashMap.get(key);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (Integer key : hashMap.keySet()) {
            if (max == hashMap.get(key)) {
                list.add(key);
            }
        }
        return  list.stream().mapToInt(Integer::valueOf).toArray();
    }
}

public class LeetCode501 {
    public static void main(String[] args) {
        Solution solution = new Solution();

    }
}
