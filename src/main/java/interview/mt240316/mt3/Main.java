package interview.mt240316.mt3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNextInt()) { // 注意 while 处理多个 case
            int size = scanner.nextInt();
            int times = scanner.nextInt();
            long[] list = new long[size];
            long sum = 0;
            for (int i = 0; i < size; i++) {
                list[i] = scanner.nextInt();
            }

            long[] two = new long[times + 1];
            two[0] = 1;
            for (int i = 1; i <= times; i++) {
                two[i] = 2 * two[i - 1] % 1000000007;
            }
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < times; i++) {
                int temp = scanner.nextInt() - 1;
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }

            for (int i = 0; i < size; i++) {
                if (map.containsKey(i)) {
                    sum = (sum + list[i] * two[times - map.get(i)]) % 1000000007;
                } else {
                    sum = (sum + list[i] * two[times]) % 1000000007;
                }
            }
            System.out.println(sum);
        }
    }
}









