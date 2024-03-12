package LeetCode.Middle.LeetCode2471;

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
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int count = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            Queue<TreeNode> qqq = new LinkedList<>();
            List<Integer> list = new ArrayList<>();
            while (!queue.isEmpty()) {
                TreeNode temp = queue.poll();
                if (temp.left != null) {
                    qqq.add(temp.left);
                }
                if (temp.right != null) {
                    qqq.add(temp.right);
                }
                list.add(temp.val);
            }
            count += get(list);
            queue = qqq;
        }
        return count;
    }

    private int get(List<Integer> list) {
        List<Integer> lll = new ArrayList<>(list);
        Collections.sort(lll);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(lll.get(i), i);
        }
        boolean[] visit = new boolean[list.size()];
        int loop = 0;
        for (int i = 0; i < list.size(); i++) {
            if (!visit[i]) {
                int temp = i;
                while (!visit[temp]) {
                    int index = map.get(list.get(temp));
                    visit[temp] = true;
                    temp = index;
                }
                loop++;
            }
        }
        return list.size() - loop;
    }

}

public class LeetCode2471 {
    public static void main(String[] args) {
    }
}






