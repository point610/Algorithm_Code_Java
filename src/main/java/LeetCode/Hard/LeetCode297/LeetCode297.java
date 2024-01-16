package LeetCode.Hard.LeetCode297;


/**
 * @ClassName LeetCode297
 * @Description TODO
 * @Author point
 * @Date 2023/11/26 16:35
 * @Version 1.0
 */
class TreeNode {
    int val;

    TreeNode left;

    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Codec {
    private StringBuilder temp;

    private int index;

    private void DFS(TreeNode node) {
        if (node == null) {
            temp.append("null ");
            return;
        }
        temp.append(node.val);
        temp.append(' ');
        DFS(node.left);
        DFS(node.right);
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        temp = new StringBuilder();
        DFS(root);
        temp.deleteCharAt(temp.length() - 1);
        return temp.toString();
    }

    private TreeNode DFSTWO(String[] strings) {
        if (index == strings.length) {
            return null;
        }
        if ("null".equals(strings[index])) {
            index++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(strings[index]));
        index++;
        // 直接对node的left和right进行赋值
        node.left = DFSTWO(strings);
        node.right = DFSTWO(strings);
        return node;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        return DFSTWO(data.split(" "));
    }
}

public class LeetCode297 {
}
