package CodeTop.HW2.HW572;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
class Solution {
    private StringBuilder one;
    private StringBuilder two;

    private void DFSONE(TreeNode node) {
        if (node == null) {
            one.append(' ');
            one.append('n');
            return;
        }
        one.append(' ');
        one.append(node.val);

        DFSONE(node.left);
        DFSONE(node.right);

    }

    private void DFSTWO(TreeNode node) {
        if (node == null) {
            two.append(' ');
            two.append('n');
            return;
        }
        two.append(' ');
        two.append(node.val);

        DFSTWO(node.left);
        DFSTWO(node.right);

    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        one = new StringBuilder();
        two = new StringBuilder();

        DFSONE(root);
        DFSTWO(subRoot);
        return one.indexOf(String.valueOf(two)) != -1;
    }
}

public class HW572 {
}
