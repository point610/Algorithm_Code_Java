package NKW_HW.two.HJ68;

import java.util.*;

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
        String one;
        int two;

        public Node(String one, int two) {
            this.one = one;
            this.two = two;
        }
    }

    public static void solution(Scanner scanner) {
        int size = scanner.nextInt();
        int type = scanner.nextInt();
        scanner.nextLine();
        List<Node> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String[] split = scanner.nextLine().split(" ");
            Node node = new Node(split[0], Integer.parseInt(split[1]));
            list.add(node);
        }
        if (type == 1) {
            Collections.sort(list, new Comparator<Node>() {
                @Override
                public int compare(Node o1, Node o2) {
                    return o1.two - o2.two;
                }
            });
        } else {
            Collections.sort(list, new Comparator<Node>() {
                @Override
                public int compare(Node o1, Node o2) {
                    return o2.two - o1.two;
                }
            });
        }
        for (Node node : list) {
            System.out.println(node.one + " " + node.two);
        }
    }
}












