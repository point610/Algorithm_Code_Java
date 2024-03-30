package NKW_HW.one.HJ41;

import java.util.*;


// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    static class Node {
        int value;

        int number;

        public Node(int value, int number) {
            this.value = value;
            this.number = number;
        }
    }

    private static Set<Integer> set;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNextInt()) { // 注意 while 处理多个 case
            int size = scanner.nextInt();
            set = new HashSet<>();
            set.add(0);
            Node[] nodes = new Node[size];
            int[] value = new int[size];
            int[] number = new int[size];
            for (int i = 0; i < size; i++) {
                value[i] = scanner.nextInt();
            }
            for (int i = 0; i < size; i++) {
                number[i] = scanner.nextInt();
            }
            for (int i = 0; i < size; i++) {
                nodes[i] = new Node(value[i], number[i]);
            }
            getOne(nodes);
            System.out.println(set.size());
        }
    }


    private static void getOne(Node[] nodes) {

        int size = nodes.length;
        for (int i = 0; i < size; i++) {
            int value = nodes[i].value;
            int number = nodes[i].number;
            Set<Integer> temp = new HashSet<>();
            for (int j = 1; j <= number; j++) {
                int tempvalue = j * value;
                temp.add(tempvalue);
                for (Integer v : set) {
                    temp.add(v + tempvalue);
                }
            }
            set.addAll(temp);
        }
    }
}