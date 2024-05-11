package LQB.saas.s2;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            solution(scanner);
        }
    }

    private static class TreeNode {
        char value;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(char value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    private static TreeNode buildTree(String midorder, String postorder) {
        if (postorder.isEmpty()) {
            return null;
        }
        char rootValue = postorder.charAt(postorder.length() - 1);

        TreeNode root = new TreeNode(rootValue, null, null);

        int rootIndex = midorder.indexOf(rootValue);
        String leftMidorder = midorder.substring(0, rootIndex);
        String rightMidorder = midorder.substring(rootIndex + 1);

        int leftPostorderLength = leftMidorder.length();
        String leftPostorder = postorder.substring(0, leftPostorderLength);
        String rightPostorder = postorder.substring(leftPostorderLength, postorder.length() - 1);

        root.left = buildTree(leftMidorder, leftPostorder);
        root.right = buildTree(rightMidorder, rightPostorder);

        return root;
    }

    private static StringBuilder stringBuilder;

    private static void getpreorder(TreeNode node) {
        if (node == null) {
            return;
        }
        stringBuilder.append(node.value);
        getpreorder(node.left);
        getpreorder(node.right);
    }

    public static void solution(Scanner scanner) {
        String midorder = scanner.nextLine();
        String postorder = scanner.nextLine();
        stringBuilder = new StringBuilder();

        TreeNode root = buildTree(midorder, postorder);
        getpreorder(root);

        System.out.println(stringBuilder);

    }
}












