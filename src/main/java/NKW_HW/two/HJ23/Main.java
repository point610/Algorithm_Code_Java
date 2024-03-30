package NKW_HW.two.HJ23;

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

    public static class Node {
        char cc;
        int times;

        public Node(char cc, int times) {
            this.cc = cc;
            this.times = times;
        }
    }

    public static void solution(Scanner scanner) {
        Map<Character, Node> map = new HashMap<>();
        String ss = scanner.nextLine();
        char[] ccc = ss.toCharArray();
        for (char cc : ccc) {
            if (map.containsKey(cc)) {
                map.get(cc).times++;
            } else {
                map.put(cc, new Node(cc, 1));
            }
        }
        int min = Integer.MAX_VALUE;
        for (Character key : map.keySet()) {
            min = Math.min(min, map.get(key).times);
        }
        Set<Character> set = new HashSet<>();
        for (Character key : map.keySet()) {
            if (map.get(key).times == min) {
                set.add(key);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (char cc : ccc) {
            if (!set.contains(cc)) {
                stringBuilder.append(cc);
            }
        }
        System.out.println(stringBuilder);
    }
}












