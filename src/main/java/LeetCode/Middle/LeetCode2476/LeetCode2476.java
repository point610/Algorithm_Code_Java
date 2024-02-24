package LeetCode.Middle.LeetCode2476;

import java.util.ArrayList;
import java.util.List;

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
    private List<List<Integer>> list;
    private List<Integer> all;

    private void DFS(TreeNode node) {
        if (node == null) {
            return;
        }
        DFS(node.left);
        all.add(node.val);
        DFS(node.right);
    }

    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        list = new ArrayList<>();
        all = new ArrayList<>();
        DFS(root);

        for (int i = 0; i < queries.size(); i++) {
            int current = queries.get(i);
            int index = getbinary(current);
            if (all.get(index) == current) {
                List<Integer> temp = new ArrayList<>();
                temp.add(all.get(index));
                temp.add(all.get(index));
                list.add(temp);
                continue;
            }
            if (index == 0) {
                if (all.get(index) < current) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(all.get(index));
                    temp.add(all.get(index + 1));
                    list.add(temp);
                    continue;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(-1);
                    temp.add(all.get(index));
                    list.add(temp);
                    continue;
                }
            }
            if (index == all.size() - 1) {
                if (all.get(index) < current) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(all.get(index));
                    temp.add(-1);
                    list.add(temp);
                    continue;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(all.get(index - 1));
                    temp.add(all.get(index));
                    list.add(temp);
                    continue;
                }
            }

            if (all.get(index) < current) {
                List<Integer> temp = new ArrayList<>();
                temp.add(all.get(index));
                temp.add(all.get(index + 1));
                list.add(temp);
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(all.get(index - 1));
                temp.add(all.get(index));
                list.add(temp);
            }

        }

        return list;
    }

    private int getbinary(int target) {
        int left = 0;
        int right = all.size() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (all.get(mid) == target) {
                return mid;
            }
            if (all.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;

    }
}

public class LeetCode2476 {
    public static void main(String[] args) {
    }
}
