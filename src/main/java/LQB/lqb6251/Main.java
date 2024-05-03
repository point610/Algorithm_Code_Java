package LQB.lqb6251;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    private static class Node {
        long val;
        long index;

        public Node(long val, long index) {
            this.val = val;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            solution(scanner);
        }
    }

    private static List<Long> getmax(int n, int k, List<Long> list) {
        List<Long> res = new ArrayList<>();
        Deque<Node> deque = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            Node node = new Node(list.get(i), i);
            while (!deque.isEmpty() && deque.peekLast().val < node.val) {
                deque.pollFirst();
            }
            deque.addLast(node);
        }
        for (int i = k, j = 0; i < n; i++) {
            Node addnode = new Node(list.get(i), i);
            res.add(deque.peekFirst().val);
            if (deque.peekFirst().index <= j) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && deque.peekLast().val < addnode.val) {
                deque.pollFirst();
            }
            deque.addLast(addnode);
        }
        res.add(deque.peekFirst().val);
        return res;
    }

    private static List<Long> getmin(int n, int k, List<Long> list) {
        List<Long> res = new ArrayList<>();
        Deque<Node> deque = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            Node node = new Node(list.get(i), i);
            while (!deque.isEmpty() && deque.peekLast().val > node.val) {
                deque.pollFirst();
            }
            deque.addLast(node);
        }
        for (int i = k, j = 0; i < n; i++) {
            Node addnode = new Node(list.get(i), i);
            res.add(deque.peekFirst().val);
            if (deque.peekFirst().index <= j) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && deque.peekLast().val > addnode.val) {
                deque.pollFirst();
            }
            deque.addLast(addnode);
        }
        res.add(deque.peekFirst().val);
        return res;
    }

    public static void solution(Scanner scanner) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long temp = scanner.nextLong();
            list.add(temp);
        }
        List<Long> max = getmax(n, k, list);
        List<Long> min = getmin(n, k, list);
        long sum = 0;
        for (Long one : max) {
            for (Long two : min) {
                sum += one - two;
            }
        }
        System.out.printf("%.2f", (sum * 1.0 / (max.size() * min.size())));
    }
}












