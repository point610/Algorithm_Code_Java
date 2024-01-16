package NKW_HW.HJ70;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    private static class Node {
        int one;

        int two;

        public Node(int one, int two) {
            this.one = one;
            this.two = two;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int size = scanner.nextInt();
            Queue<Node> nodes = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                nodes.add(new Node(scanner.nextInt(), scanner.nextInt()));
            }
            scanner.nextLine();
            String ss = scanner.nextLine();

            get(nodes, ss);

        }
    }

    private static int jisuan(Node one, Node two) {
        return one.one * one.two * two.two;
    }

    private static void get(Queue<Node> queue, String ss) {
        long sum = 0;
        Stack<Character> stack = new Stack<>();
        Stack<Node> nodes = new Stack<>();
        for (char cc : ss.toCharArray()) {
            if (cc == '(') {
                stack.push(cc);
            } else if (cc == ')') {
                stack.pop();
                stack.pop();
                // 出来
                Node two = nodes.pop();
                Node one = nodes.pop();

                // 计算
                long temp = jisuan(one, two);
                sum += temp;

                // 加入
                nodes.push(new Node(one.one, two.two));

            } else {
                stack.push('A');
                nodes.push(queue.poll());
            }

        }
        System.out.println(sum);

    }
}