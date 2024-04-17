package temp.hw.two;

import java.util.*;

public class Main {
    private static class Node {
        String value;
        int yanzhong;
        int yiban;
        List<Node> list;

        public Node(String value) {
            this.value = value;
            this.yanzhong = 0;
            this.yiban = 0;
            this.list = new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            soluction(scanner);
        }
    }

    private static Map<String, Node> map;
    private static Set<String> set;
    private static int yanzhong;
    private static int yiban;

    private static void soluction(Scanner scanner) {
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.nextLine();
        map = new HashMap<>();
        set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String[] split = scanner.nextLine().split(" ");
            String current = split[0];
            String father = split[1];
            Integer type = Integer.parseInt(split[2]);
            Integer number = Integer.parseInt(split[3]);
            if (father.equals("*")) {
                set.add(current);
            }

            if (map.containsKey(current)) {
                Node node = map.get(current);

                if (type == 0) {
                    node.yanzhong += number;
                } else {
                    node.yiban += number;
                }

            } else {
                // 赋值
                Node node = new Node(current);
                if (type == 0) {
                    node.yanzhong += number;
                } else {
                    node.yiban += number;
                }
                map.put(current, node);

                if (map.containsKey(father)) {
                    Node fa = map.get(father);
                    fa.list.add(node);
                } else {
                    Node fa = new Node(father);
                    fa.list.add(node);
                    map.put(father, fa);
                }
            }
        }
        int res = 0;
        for (String key : set) {
            yanzhong = 0;
            yiban = 0;

            dfs(map.get(key));

            if (M < (5 * yanzhong + 2 * yiban)) {
                res++;
            }
        }
        System.out.print(res);
    }

    private static void dfs(Node node) {
        if (node == null) {
            return;
        }
        yanzhong += node.yanzhong;
        yiban += node.yiban;

        for (Node temp : node.list) {
            dfs(temp);
        }
    }
}












