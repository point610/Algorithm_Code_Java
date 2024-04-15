package NKW_HW.two.HJ18;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    private static class Node {
        long one;
        long two;

        public Node(long one, long two) {
            this.one = one;
            this.two = two;
        }
    }

    private static List<Node> nodes;
    private static Node ANode;
    private static Node BNode;
    private static Node CNode;
    private static Node DNode;
    private static Node ENode;

    public static void main(String[] args) {
        nodes = new ArrayList<>();
        initial();
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int E = 0;
        int huo = 0;//错误IP地址或错误掩码
        int si = 0;

        while (scanner.hasNext()) {
            String[] split = scanner.nextLine().split("~");
            String one = split[0];
            String two = split[1];
            if (allno(one)) {
                continue;
            }
            if (ip(one) && ziwang(two)) {
                long temp = ip2long(one);
                if (ANode.one <= temp && temp <= ANode.two) {
                    A++;
                } else if (BNode.one <= temp && temp <= BNode.two) {
                    B++;
                } else if (CNode.one <= temp && temp <= CNode.two) {
                    C++;
                } else if (DNode.one <= temp && temp <= DNode.two) {
                    D++;
                } else if (ENode.one <= temp && temp <= ENode.two) {
                    E++;
                }
                if (issi(one)) {
                    si++;
                }
            } else {
                huo++;
            }
        }
        System.out.println(A + " " + B + " " + C + " " + D + " " + E + " " + huo + " " + si);
    }

    private static void initial() {
        nodes.add(new Node(ip2long("10.0.0.0"), ip2long("10.255.255.255")));
        nodes.add(new Node(ip2long("172.16.0.0"), ip2long("172.31.255.255")));
        nodes.add(new Node(ip2long("192.168.0.0"), ip2long("192.168.255.255")));

        ANode = new Node(ip2long("1.0.0.0"), ip2long("126.255.255.255"));
        BNode = new Node(ip2long("128.0.0.0"), ip2long("191.255.255.255"));
        CNode = new Node(ip2long("192.0.0.0"), ip2long("223.255.255.255"));
        DNode = new Node(ip2long("224.0.0.0"), ip2long("239.255.255.255"));
        ENode = new Node(ip2long("240.0.0.0"), ip2long("255.255.255.255"));
    }

    private static long ip2long(String one) {
        String[] split = one.split("\\.");
        long res = 0;
        for (int i = 0; i < split.length; i++) {
            res = res << 8 | Long.parseLong(split[i]);
        }
        return res;
    }

    private static boolean allno(String one) {
        String[] split = one.split("\\.");
        if (split[0].equals("0") || split[0].equals("127")) {
            return true;
        }
        return false;
    }

    private static boolean issi(String one) {
        long temp = ip2long(one);
        for (Node node : nodes) {
            if (node.one <= temp && temp <= node.two) {
                return true;
            }
        }
        return false;
    }

    private static boolean ziwang(String one) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            String[] split = one.split("\\.");
            for (String ss : split) {
                int integer = Integer.parseInt(ss);
                if (integer < 0 || integer > 255) {
                    return false;
                }
                StringBuilder tempss = new StringBuilder(Integer.toBinaryString(integer));
                while (tempss.length() != 8) {
                    tempss.insert(0, "0");
                }
                stringBuilder.append(tempss);
            }
            if (!(stringBuilder.toString().contains("1")) || !(stringBuilder.toString().contains("0"))) {
                return false;
            }
            // 是否1  0
            int index = 0;
            while (index < stringBuilder.length() && stringBuilder.charAt(index) == '1') {
                index++;
            }
            while (index < stringBuilder.length()) {
                if (stringBuilder.charAt(index) == '1') {
                    return false;
                }
                index++;
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private static boolean ip(String one) {
        try {
            String[] split = one.split("\\.");
            for (String ss : split) {
                int integer = Integer.parseInt(ss);
                if (integer < 0 || integer > 255) {
                    return false;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}












