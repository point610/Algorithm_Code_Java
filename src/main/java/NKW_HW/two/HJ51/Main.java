package NKW_HW.two.HJ51;

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
        ListNode head = new ListNode();
        ListNode point = head;
        for (int i = 0; i < size; i++) {
            point.next = new ListNode(scanner.nextInt(), null);
            point = point.next;
        }
        int k = scanner.nextInt();
        point = head;
        for (int i = 0; i < k; i++) {
            point = point.next;
        }
        while (point != null) {
            head = head.next;
            point = point.next;
        }
        System.out.println(head.value);

    }
}

class ListNode {
    int value;
    ListNode next;

    public ListNode() {

    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}










