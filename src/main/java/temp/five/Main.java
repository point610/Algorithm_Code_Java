package temp.five;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNextInt()) { // 注意 while 处理多个 case
            int person = scanner.nextInt();
            int edge = scanner.nextInt();
            int times = scanner.nextInt();

            Map<Integer, Set<Integer>> list = new HashMap<>();
            for (int i = 0; i < edge; i++) {
                int one = scanner.nextInt() - 1;
                int two = scanner.nextInt() - 1;
                if (!list.containsKey(one)) {
                    list.put(one, new HashSet<>());
                }
                if (!list.containsKey(two)) {
                    list.put(two, new HashSet<>());
                }
                list.get(one).add(two);
                list.get(two).add(one);
            }

            for (int i = 0; i < times; i++) {
                int type = scanner.nextInt();
                int one = scanner.nextInt() - 1;
                int two = scanner.nextInt() - 1;
                if (type == 1) {
                    if (!list.containsKey(one) || !list.containsKey(two)) {
                        continue;
                    }
                    list.get(one).remove(two);
                    list.get(two).remove(one);
                } else if (type == 2) {
                    if (get(list, person, one, two)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }
            }
        }
    }

    private static boolean get(Map<Integer, Set<Integer>> list, int size, int one, int two) {
        boolean[] visit = new boolean[size];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(one);
        visit[one] = true;
        while (!queue.isEmpty()) {
            Queue<Integer> qqq = new LinkedList<>();
            while (!queue.isEmpty()) {
                int temp = queue.poll();
                if (!list.containsKey(temp)) {
                    continue;
                }
                Set<Integer> set = list.get(temp);
                for (Integer integer : set) {
                    if (!visit[integer]) {
                        if (integer == two) {
                            return true;
                        }
                        visit[integer] = true;
                        qqq.add(integer);
                    }
                }
            }
            queue = qqq;
        }
        return false;
    }
}