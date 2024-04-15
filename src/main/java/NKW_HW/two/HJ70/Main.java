package NKW_HW.two.HJ70;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            solution(scanner);
        }
    }

    private static class Node {
        int one;
        int two;

        public Node(int one, int two) {
            this.one = one;
            this.two = two;
        }
    }

    public static void solution(Scanner scanner) {
        int size = scanner.nextInt();
        List<Node> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int one = scanner.nextInt();
            int two = scanner.nextInt();
            Node node = new Node(one, two);
            list.add(node);
        }
        scanner.nextLine();
        String ss = scanner.nextLine();
        int index = 0;
        long res = 0;
        Stack<Node> stack = new Stack<>();
        for (char cc : ss.toCharArray()) {
            if (cc == ')') {
                Node two = stack.pop();
                Node one = stack.pop();
                Node node = new Node(one.one, two.two);
                res += (long) one.one * one.two * two.two;
                stack.add(node);

            } else if (cc == '(') {
            } else {
                stack.add(list.get(index));
                index++;
            }
        }
        System.out.println(res);
    }
}












