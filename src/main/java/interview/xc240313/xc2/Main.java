package interview.xc240313.xc2;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<Node> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(new Node(scanner.nextLong(), i));
        }

        Collections.sort(list, (o1, o2) -> (int) (o1.value - o2.value));

        for (int i = 1; i < list.size(); i++) {
            list.get(i).left = list.get(i - 1).left + list.get(i - 1).value;
        }
        for (int i = list.size() - 2; i >= 0; i--) {
            list.get(i).right = list.get(i + 1).right + list.get(i + 1).value;
        }

        for (int i = 0; i < list.size(); i++) {
            long left = list.get(i).value * i;
            long right = list.get(i).value * (size - i - 1);
            list.get(i).sum = (left - list.get(i).left) + (list.get(i).right - right);
        }
        Collections.sort(list, (o1, o2) -> (int) (o1.index - o2.index));

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(list.get(i).sum);
            stringBuilder.append('\n');
        }
        System.out.print(stringBuilder);
    }

    static class Node {
        long value;
        long index;
        long left;
        long right;
        long sum;

        public Node(long value, long index) {
            this.value = value;
            this.index = index;
            left = 0;
            right = 0;
            sum = 0;
        }
    }

}



