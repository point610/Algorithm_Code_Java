package NKW_HW.one.HJ24;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            int count = scanner.nextInt();
            int[] list = new int[count];
            for (int i = 0; i < count; i++) {
                list[i] = scanner.nextInt();
            }
            int[] left = new int[count];
            int[] right = new int[count];
            left[0] = 1;
            right[count - 1] = 1;
            for (int i = 0; i < count; i++) {
                left[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (list[i] > list[j]) {
                        left[i] = Math.max(left[j] + 1, left[i]);
                    }
                }
            }

            for (int i = count - 1; i >= 0; i--) {
                right[i] = 1;
                for (int j = count - 1; j > i; j--) {
                    if (list[i] > list[j]) {
                        right[i] = Math.max(right[j] + 1, right[i]);
                    }
                }
            }

            int max = 1;
            for (int i = 0; i < count; i++) {
                max = Math.max(max, left[i] + right[i] - 1);
            }
            System.out.println(count - max);


        }
    }
}