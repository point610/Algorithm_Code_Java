package LeetCode.Middle.LeetCode508;


import java.util.*;

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
    private Map<Integer, Integer> map;

    public int[] findFrequentTreeSum(TreeNode root) {
        map = new HashMap<>();
        dfs(root);
        int max = 0;
        for (Integer key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        List<Integer> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if (max == map.get(key)) {
                list.add(key);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = dfs(node.left);
        int right = dfs(node.right);
        int temp = left + right + node.val;
        map.put(temp, map.getOrDefault(temp, 0) + 1);

        return temp;
    }
}

public class LeetCode508 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(5, new TreeNode(2, null, null), new TreeNode(-3, null, null));
        System.out.println(Arrays.toString(solution.findFrequentTreeSum(root)));
    }
}
