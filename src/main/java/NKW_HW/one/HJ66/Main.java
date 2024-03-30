package NKW_HW.one.HJ66;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    private static class Node {
        String oo;

        String tt;

        String zhix;

        public Node(String oo, String zhix) {
            this.oo = oo;
            this.zhix = zhix;
        }

        public Node(String oo, String tt, String zhix) {
            this.oo = oo;
            this.tt = tt;
            this.zhix = zhix;
        }
    }

    private static List<Node> one = new ArrayList<>();

    private static List<Node> two = new ArrayList<>();

    public static void main(String[] args) {
        one.add(new Node("reset", "reset what"));
        two.add(new Node("reset", "board", "board fault"));
        two.add(new Node("board", "add", "where to add"));
        two.add(new Node("board", "delete", "no board at all"));
        two.add(new Node("reboot", "backplane", "impossible"));
        two.add(new Node("backplane", "abort", "install first"));
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String ss = scanner.nextLine();
            System.out.println(get(ss));

        }
    }

    private static String get(String ss) {

        String[] split = ss.split(" ");
        if (split.length == 1) {
            for (Node node : one) {
                String temp = node.oo;
                if (temp.indexOf(ss) == 0) {
                    return node.zhix;
                }
            }
        } else if (split.length == 2) {
            List<String> res = new ArrayList<>();
            String oo = split[0];
            String tt = split[1];
            for (Node node : two) {
                if (node.oo.indexOf(oo) == 0 && node.tt.indexOf(tt) == 0) {
                    res.add(node.zhix);
                }
            }
            if (res.size() == 1) {
                return res.get(0);
            }
        }
        return "unknown command";
    }
}