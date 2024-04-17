package temp.hw.three;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            soluction(scanner);
        }
    }


    private static void soluction(Scanner scanner) {
        int size = scanner.nextInt();
        int[][] list = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int temp = scanner.nextInt();
                list[i][j] = temp;
            }
        }
        Map<Integer, Integer> capmap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            capmap.put(i, scanner.nextInt());
        }

        int outindex = scanner.nextInt();
        int outsum = scanner.nextInt();
        List<Node> nodes = new ArrayList<>();
        foryyy(list);
        for (int i = 0; i < size; i++) {
            if (i == outindex) {
                continue;
            }
            int index = i;
            int dis = list[outindex][i];
            int cap = capmap.get(index);
            Node node = new Node(index, cap, dis);
            nodes.add(node);
        }

        Collections.sort(nodes, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if (o1.dis == o2.dis) {
                    return o1.index - o2.index;
                }
                return o1.dis - o2.dis;
            }
        });

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nodes.size() && outsum > 0; i++) {
            Node current = nodes.get(i);
            outsum -= current.cap;
            res.add(current.index);
        }

        print(res);
    }

    private static void print(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1) {
                System.out.print(" ");
            }
        }
    }

    private static class Node {
        int index;
        int cap;
        int dis;

        public Node(int index, int cap, int dis) {
            this.index = index;
            this.cap = cap;
            this.dis = dis;
        }
    }

    private static void foryyy(int[][] list) {
        int size = list.length;
        // i》k》j
        for (int k = 0; k < size; k++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    // 无法到达
                    if (list[i][k] == -1 || list[k][j] == -1 || i == j) {
                        continue;
                    }

                    // 可以到达
                    if (list[i][j] == -1) {
                        list[i][j] = list[i][k] + list[k][j];
                    } else {
                        list[i][j] = Math.min(list[i][j], list[i][k] + list[k][j]);
                    }
                }
            }
        }
    }
}












