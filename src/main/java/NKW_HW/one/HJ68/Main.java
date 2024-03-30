package NKW_HW.one.HJ68;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    private static class Node {
        String name;

        int value;

        public Node(String name, int value) {
            this.name = name;
            this.value = value;
        }

        @Override
        public String toString() {
            return name + " " + value ;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int size = scanner.nextInt();
            int type = scanner.nextInt();
            scanner.nextLine();
            List<Node> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                String[] split = scanner.nextLine().split(" ");
                list.add(new Node(split[0], Integer.parseInt(split[1])));
            }
            switch (type) {
                case 0: {
                    Collections.sort(list, new Comparator<Node>() {
                        @Override
                        public int compare(Node o1, Node o2) {
                            return o2.value - o1.value;
                        }
                    });
                    break;
                }
                case 1: {
                    Collections.sort(list, new Comparator<Node>() {
                        @Override
                        public int compare(Node o1, Node o2) {
                            return o1.value - o2.value;
                        }
                    });
                    break;
                }
            }

            for (Node node : list) {
                System.out.println(node);
            }
        }


    }
}