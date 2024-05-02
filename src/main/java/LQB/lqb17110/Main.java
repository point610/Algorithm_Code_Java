package LQB.lqb17110;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    private static class Node {
        int ll;
        int rr;

        public Node(int ll, int rr) {
            this.ll = ll;
            this.rr = rr;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            solution(scanner);
        }
    }

    public static void solution(Scanner scanner) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Node> N = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int ll = scanner.nextInt();
            int rr = scanner.nextInt();
            Node node = new Node(ll, rr);
            N.add(node);
        }

        List<Node> M = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int ll = scanner.nextInt();
            int rr = scanner.nextInt();
            Node node = new Node(ll, rr);
            M.add(node);
        }

        for (Node one : M) {
            int size = 0;
            for (Node two : N) {
                int length = getlength(one, two);
                if (length*2 >= (two.rr - two.ll)) {
                    size++;
                }
            }
            System.out.println(size);
        }
    }

    private static int getlength(Node one, Node two) {
        int ll = Math.max(one.ll, two.ll);
        int rr = Math.min(one.rr, two.rr);
        return rr - ll;
    }
}














