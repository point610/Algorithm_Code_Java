package NKW_HW.two.HJ48;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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

    private static class Node {
        private int val;
        private Node next = null;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void solution(Scanner scanner) {
        int size = scanner.nextInt();
        Map<Integer, Node> map = new HashMap<>();
        int temp = scanner.nextInt();
        Node head = new Node(temp);
        map.put(temp, head);
        for (int i = 0; i < size - 1; i++) {
            int value = scanner.nextInt();
            int key = scanner.nextInt();

            Node node = new Node(value);
            map.put(value, node);

            insert(map.get(key), node);

        }

        temp = scanner.nextInt();

        Node point = new Node(0);
        Node tt = point;

        point.next = head;
        while (point.next.val != temp) {
            point = point.next;
        }
        point.next = point.next.next;

        tt = tt.next;
        while (tt != null) {
            System.out.print(tt.val);
            System.out.print(" ");
            tt = tt.next;
        }

    }

    private static void insert(Node one, Node two) {
        two.next = one.next;
        one.next = two;

    }
}












