package NKW_HW.two.HJ58;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            int size = scanner.nextInt();
            int k = scanner.nextInt();
            PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
            for (int i = 0; i < size; i++) {
                int temp = scanner.nextInt();
                if (queue.size() < k) {
                    queue.add(temp);
                } else {
                    Integer poll = queue.poll();
                    if (poll < temp) {
                        queue.add(poll);
                    } else {
                        queue.add(temp);
                    }
                }
            }
            List<Integer> list = new ArrayList<>();
            while (!queue.isEmpty()) {
                list.add(queue.poll());
            }
            Collections.reverse(list);
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
                System.out.print(' ');
            }

        }
    }
}