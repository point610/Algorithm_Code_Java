package LQB.saas.s1;

import java.util.ArrayList;
import java.util.List;
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

    public static void solution(Scanner scanner) {
        int size = scanner.nextInt();
        int needall = scanner.nextInt();
        List<Node> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int one = scanner.nextInt();
            int two = scanner.nextInt();
            Node node = new Node(one, two);
            list.add(node);
        }
        int right = 100001;
        int left = 1;
        int res = 0;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (check(list, mid, needall)) {
                left = mid + 1;
                res = mid;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(res);
    }

    private static boolean check(List<Node> list, int mid, int needall) {
        int sum = 0;
        for (Node node : list) {
            int one = node.one / mid;
            int two = node.two / mid;
            sum += one * two;
        }
        return sum >= needall;
    }

    private static class Node {
        int one;
        int two;

        public Node(int one, int two) {
            this.one = one;
            this.two = two;
        }
    }
}












