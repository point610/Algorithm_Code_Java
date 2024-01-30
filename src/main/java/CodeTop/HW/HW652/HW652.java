package CodeTop.HW.HW652;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private List<TreeNode> lll;
    private Map<String, Integer> map;

    private String DFS(TreeNode node) {
        if (node == null) {
            return " ";
        }
        StringBuilder stringBuilder = new StringBuilder();
        // 加上当前node 的value 和分隔符
        stringBuilder.append(node.val);
        stringBuilder.append('_');

        // 加上当前node 的左右子树的string
        stringBuilder.append(DFS(node.left));
        stringBuilder.append(DFS(node.right));

        String key = stringBuilder.toString();
        map.put(key, map.getOrDefault(key, 0) + 1);

        // 只能为等于2时，加入lll，防止加入相同的node
        if (map.get(key) == 2) {
            lll.add(node);
        }

        return key;
    }

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        lll = new ArrayList<>();
        map = new HashMap<>();
        DFS(root);
        return lll;
    }
}

public class HW652 {
}
