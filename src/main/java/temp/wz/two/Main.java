package temp.wz.two;

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
        TreeMap<Integer, Integer> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            list[i] = scanner.nextInt();
        }
        Arrays.sort(list);
        for (int i = 0; i < size; i++) {
            treeMap.put(list[i], i);
        }
        int times = scanner.nextInt();
        for (int i = 0; i < times; i++) {
            Integer integer = treeMap.floorKey(scanner.nextInt());
            if (integer == null) {
                System.out.println(0);
            } else {
                System.out.println(treeMap.get(integer) + 1);
            }
        }
    }


}












