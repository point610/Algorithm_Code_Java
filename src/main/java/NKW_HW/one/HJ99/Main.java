package NKW_HW.one.HJ99;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int count = 0;
        for (int i = 0; i <= size; i++) {
            if (iszishou(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean iszishou(int one) {
        int size = String.valueOf(one).length();
        int mod = (int) Math.pow(10, size);
        return one == (one * one % mod);

    }
}