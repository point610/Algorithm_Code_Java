package NKW_HW.two.HJ19;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    private static class Node {
        String one;
        String two;

        String all;
        int times;

        public Node(String one, String two) {
            this.one = one;
            this.two = two;
            this.all = one + two;
            this.times = 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        List<Node> nodes = new ArrayList<>();
        Map<String, Integer> str2index = new HashMap<>();
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            String[] split = scanner.nextLine().split(" ");
            String[] temp = split[0].split("\\\\");
            String one = temp[temp.length - 1];
            if (one.length() > 16) {
                one = one.substring(one.length() - 16);
            }
            Node node = new Node(one, split[1]);
            if (str2index.containsKey(node.all)) {
                int index = str2index.get(node.all);
                nodes.get(index).times++;
            } else {
                nodes.add(node);
                str2index.put(node.all, nodes.size() - 1);
            }
        }
        int end = Math.max(0, nodes.size() - 8);
        for (int i = end; i < nodes.size(); i++) {
            System.out.println(nodes.get(i).one + " " + nodes.get(i).two + " " + nodes.get(i).times);
        }
    }

}












