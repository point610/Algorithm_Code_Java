package CodeTop.HW2.HW144;

import java.util.ArrayList;
import java.util.List;

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
    List<Integer> integerList = new ArrayList<>();

    public void post(TreeNode root) {
        if (root != null) {
            integerList.add(root.val);
            post(root.left);
            post(root.right);
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        post(root);
        return integerList;
    }
}

public class HW144 {
}
