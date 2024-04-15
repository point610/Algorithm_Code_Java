package NKW_HW.two.HJ25;

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

    public static void solution(Scanner scanner) {
        List<Integer> I = new ArrayList<>();
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            I.add(scanner.nextInt());
        }
        size = scanner.nextInt();
        List<Integer> R = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            int temp = scanner.nextInt();
            if (!set.contains(temp)) {
                set.add(temp);
                R.add(temp);
            }
        }
        Collections.sort(R);

        List<Node> list = new ArrayList<>();
        for (Integer r : R) {
            List<tempNode> tempNodes = new ArrayList<>();
            for (int i = 0; i < I.size(); i++) {
                if (has(I.get(i), r)) {
                    tempNodes.add(new tempNode(i, I.get(i)));
                }
            }
            if (!tempNodes.isEmpty()) {
                Node node = new Node(r, tempNodes.size() , tempNodes);
                list.add(node);
            }
        }
        int sumsize = 0;
        for (Node node : list) {
            sumsize += node.sum;
        }
        System.out.print(sumsize + " ");
        for (Node node : list) {
            System.out.print(node);
        }
    }

    private static class Node {
        int r;
        int size;
        List<tempNode> nodes;

        int sum = 0;

        public Node(int r, int size, List<tempNode> nodes) {
            this.r = r;
            this.size = size;
            this.nodes = nodes;
            sum = 2 + nodes.size() * 2;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(r + " " + size + " ");
            for (tempNode node : nodes) {
                stringBuilder.append(node.index + " " + node.value + " ");
            }
            return stringBuilder.toString();
        }
    }

    private static class tempNode {
        int index;
        int value;

        public tempNode(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }


    private static boolean has(int one, int two) {
        return Integer.toString(one).contains(Integer.toString(two));
    }
}












