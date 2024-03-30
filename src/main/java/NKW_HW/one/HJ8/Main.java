package NKW_HW.one.HJ8;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    private static class Node {
        int index;

        long value;

        public Node(int index, long value) {
            this.index = index;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Map<Integer, Node> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            int index = scanner.nextInt();
            long value = scanner.nextLong();
            if (map.containsKey(index)) {
                Node node = map.get(index);
                long temp = value + node.value;
                node.value = temp;
                map.put(index, node);
            } else {
                map.put(index, new Node(index, value));
            }
        }
        List<Node> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            list.add(map.get(key));
        }

        Collections.sort(list, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.index - o2.index;
            }
        });
        size = list.size();
        for (int i = 0; i < size; i++) {
            Node node = list.get(i);
            System.out.print(node.index);
            System.out.print(' ');
            System.out.println(node.value);
        }
    }
}