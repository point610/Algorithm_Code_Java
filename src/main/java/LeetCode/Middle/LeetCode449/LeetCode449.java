package LeetCode.Middle.LeetCode449;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

 class Solution {
    private StringBuilder stringBuilder;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        stringBuilder = new StringBuilder();
        dfs(root);
        // 删除最后的空格
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            stringBuilder.append("-1");
            stringBuilder.append(' ');
            return;
        }
        stringBuilder.append(node.val);
        stringBuilder.append(' ');
        dfs(node.left);
        dfs(node.right);
    }

    private int index;

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] split = data.split(" ");
        index = 0;
        return dfs(split);
    }

    private TreeNode dfs(String[] split) {
        if (index == split.length || split[index].equals("-1")) {
            index++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(split[index]));
        index++;
        node.left = dfs(split);
        node.right = dfs(split);

        return node;
    }
}


public class LeetCode449 {
}
















