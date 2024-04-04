package NKW_HW.two.HJ102;

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
        char value;
        int times;

        public Node(char value, int times) {
            this.value = value;
            this.times = times;
        }
    }

    public static void solution(Scanner scanner) {
        Map<Character, Node> map = new HashMap<>();
        List<Node> list = new ArrayList<>();
        String ss = scanner.nextLine();
        for (char cc : ss.toCharArray()) {
            if (map.containsKey(cc)) {
                map.get(cc).times++;
            } else {
                Node node = new Node(cc, 1);
                list.add(node);
                map.put(cc, node);
            }
        }
        Collections.sort(list, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if (o1.times == o2.times) {
                    return o1.value - o2.value;
                }
                return o2.times - o1.times;
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (Node node : list) {
            stringBuilder.append(node.value);
        }
        System.out.println(stringBuilder);
    }
}












