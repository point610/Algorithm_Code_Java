package NKW_HW.two.HJ41;

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

    private static Set<Integer> set;

    private static class Node {
        int value;
        int times;

        public Node(int value, int times) {
            this.value = value;
            this.times = times;
        }
    }

    private static void getone(List<Node> list) {
        int size = list.size();
        for (Node node : list) {
            int value = node.value;
            int times = node.times;
            Set<Integer> sss = new HashSet<>();
            for (int i = 0; i <= times; i++) {
                int temp = value * i;
                sss.add(temp);
                for (Integer integer : set) {
                    sss.add(integer + temp);
                }
            }
            set.addAll(sss);
        }
    }

    public static void solution(Scanner scanner) {
        set = new HashSet<>();
        int size = scanner.nextInt();
        List<Node> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(new Node(scanner.nextInt(), 0));
        }
        for (int i = 0; i < size; i++) {
            list.get(i).times = scanner.nextInt();
        }
        getone(list);
        System.out.println(set.size());
    }
}












