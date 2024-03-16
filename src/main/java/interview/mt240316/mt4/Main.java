package interview.mt240316.mt4;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    private static class Node {
        int times;
        int value;

        public Node(int times, int value) {
            this.times = times;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNextInt()) { // 注意 while 处理多个 case
            int size = scanner.nextInt();
            int[] list = new int[size];
            for (int i = 0; i < size; i++) {
                list[i] = scanner.nextInt();
            }
            long sum = 0;

            for (int i = 0; i < size; i++) {
                sum += get(list, i);
            }

            System.out.println(sum);
        }
    }

    private static long get(int[] list, int startindex) {
        PriorityQueue<Node> queue = new PriorityQueue<>((o1, o2) -> {
            if (o1.times == o2.times) {
                return (o1.value - o2.value);
            }
            return (o2.times - o1.times);
        });

        Map<Integer, Node> valuemap = new HashMap<>();
        long sum = 0;
        for (int i = startindex; i < list.length; i++) {
            int temp = list[i];
            if (valuemap.containsKey(temp)) {
                queue.remove(valuemap.get(temp));
                valuemap.get(temp).times++;
                queue.offer(valuemap.get(temp));

            } else {
                Node node = new Node(1, temp);
                valuemap.put(temp, node);
                queue.offer(node);
            }
            sum += queue.peek().value;
        }
        return sum;
    }
}



















