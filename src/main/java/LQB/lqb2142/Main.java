package LQB.lqb2142;

import java.util.*;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    private static class Node {
        char value;
        int times;
        int index;

        public Node(char value, int times, int index) {
            this.value = value;
            this.times = times;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String ss = scan.nextLine();
        Map<Character, Node> map = new HashMap<>();
        List<Node> list = new ArrayList<>();

        for (int i = 0; i < ss.length(); i++) {
            char cc = ss.charAt(i);
            if (map.containsKey(cc)) {
                map.get(cc).times++;
            } else {
                Node node = new Node(cc, 1, i);
                map.put(cc, node);
                list.add(node);
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
        for (int i = 0; i < list.size() - 1; i++) {
            stringBuilder.append(list.get(i).value);
            if (list.get(i).times != list.get(i + 1).times) {
                break;
            }
        }
        System.out.println(stringBuilder);        scan.close();
    }
}

















