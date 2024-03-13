package interview.xc240313.xc3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    static class Node {
        long value;
        long times;

        public Node(long value, long times) {
            this.value = value;
            this.times = times;
        }

        @Override
        public String toString() {
            return value + "(" + times + ")";
        }
    }

    static List<Node> list;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        list = new ArrayList<>();

        getlist(s);

        List<Node> res = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            Node one = list.get(i);
            Node two = list.get(i + 1);
            if (one.value == two.value) {
                two.times += one.times;
            } else {
                res.add(new Node(one.value, one.times));
            }
        }
        res.add(new Node(list.get(list.size() - 1).value, list.get(list.size() - 1).times));


        print(res);

    }

    static void print(List<Node> res) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append('[');

        for (int i = 0; i < res.size() - 1; i++) {
            stringBuilder.append(res.get(i).toString());
            stringBuilder.append(',');
        }
        stringBuilder.append(res.get(res.size() - 1).toString());

        stringBuilder.append(']');

        System.out.println(stringBuilder);
    }

    static void getlist(String one) {
        String[] split = one.substring(1, one.length() - 1).split(",");
        for (String sss : split) {
            list.add(getnode(sss));
        }
    }

    static Node getnode(String ss) {
        String[] split = ss.split("\\(");
        String one = split[0];
        String two = split[1].substring(0, split[1].length() - 1);

        return new Node(Long.parseLong(one), Long.parseLong(two));
    }
}



