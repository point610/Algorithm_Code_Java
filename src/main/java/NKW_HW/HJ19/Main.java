package NKW_HW.HJ19;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    private static class Node {
        String ss;

        String line;

        public Node(String ss, String line) {
            this.ss = ss;
            this.line = line;
        }

        @Override
        public String toString() {
            return ss + ' ' + line + ' ';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap();
        List<Node> list = new ArrayList<>();
        while (scanner.hasNext()) {
            String[] split = scanner.nextLine().split(" ");
            String[] temps = split[0].split("\\\\");
            String path = temps[temps.length - 1];

            String finalpath = path + split[1];
            if (path.length() > 16) {
                int startindex = path.length() - 16;
                finalpath = path.substring(startindex) + split[1];
                path = path.substring(startindex);
            }

            if (map.containsKey(finalpath)) {
                map.put(finalpath, map.get(finalpath) + 1);
            } else {
                map.put(finalpath, 1);
                list.add(new Node(path, split[1]));
            }
        }
        int startindex = Math.max(0, list.size() - 8);
        for (int i = startindex; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.println(map.get(list.get(i).ss+list.get(i).line));
        }


    }
}