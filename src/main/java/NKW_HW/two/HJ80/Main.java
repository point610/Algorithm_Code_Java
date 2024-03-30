package NKW_HW.two.HJ80;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

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
        for (int i = 0; i < size; i++) {
            treeMap.put(scanner.nextInt(), 0);
        }
        size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            treeMap.put(scanner.nextInt(), 0);
        }
        for (Integer integer : treeMap.keySet()) {
            System.out.print(integer);
        }
    }
}












