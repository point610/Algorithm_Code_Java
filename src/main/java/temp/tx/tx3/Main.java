package temp.tx.tx3;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Union;

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

    public static void solution(Scanner scanner) {
        int size = scanner.nextInt();
        int times = scanner.nextInt();
        Union union = new Union(size);
        for (int i = 0; i < times; i++) {
            int one = scanner.nextInt() - 1;
            int two = scanner.nextInt() - 1;

            union.union(one, two);
        }
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            int temp = union.getfather(i);
            if (map.containsKey(temp)) {
                map.get(temp).add(i);
            } else {
                Set<Integer> set = new HashSet<>();
                set.add(i);
                map.put(temp, set);
            }
        }
        if (map.size() != 2) {
            System.out.println(0);
        } else {
            int res = 1;
            for (Integer integer : map.keySet()) {
                res = res * map.get(integer).size();
            }
            System.out.println(res);
        }
    }

    public static class Union {
        int[] list;
        int[] son;

        public Union(int size) {
            this.list = new int[size];
            this.son = new int[size];
            for (int i = 0; i < size; i++) {
                list[i] = i;
            }
            Arrays.fill(son, 1);
        }

        public int getfather(int index) {
            if (list[index] == index) {
                return index;
            }
            return getfather(list[index]);
        }

        public void union(int a, int b) {
            int fa = getfather(a);
            list[a] = fa;
            int fb = getfather(b);
            list[b] = fb;
            if (fa != fb) {
                if (son[fa] > son[fb]) {
                    list[fb] = fa;
                } else {
                    list[fa] = fb;
                }
            }
        }
    }
}












