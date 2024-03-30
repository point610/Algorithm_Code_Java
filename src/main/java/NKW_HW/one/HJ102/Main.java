package NKW_HW.one.HJ102;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    private static class Node {
        char index;

        int number;

        public Node(char index, int number) {
            this.index = index;
            this.number = number;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ss = scanner.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        int size = ss.length();
        for (int i = 0; i < size; i++) {
            map.put(ss.charAt(i), map.getOrDefault(ss.charAt(i), 0) + 1);
        }
        List<Node> list = new ArrayList<>();
        for (Character key : map.keySet()) {
            list.add(new Node(key, map.get(key)));
        }
        Collections.sort(list, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if (o1.number != o2.number) {
                    return o2.number - o1.number;
                }
                return o1.index - o2.index;

            }
        });
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).index);
        }

    }
}