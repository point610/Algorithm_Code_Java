package NKW_HW.HJ103;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int size = scanner.nextInt();
            int[] list = new int[size];
            int[] step = new int[size];
            for (int i = 0; i < size; i++) {
                list[i] = scanner.nextInt();
                step[i] = 1;
            }
            int max = 0;
            for (int i = 1; i < size; i++) {
                for (int j = i; j >= 0; j--) {
                    if (list[j] < list[i]) {
                        step[i] = Math.max(step[i], step[j] + 1);
                        max = Math.max(max, step[i]);
                    }
                }

            }
            System.out.println(max);
        }
    }
}