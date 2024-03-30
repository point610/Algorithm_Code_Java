package NKW_HW.one.HJ22;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0) {
            if (n < 3) {
                System.out.println(0);
            } else {
                System.out.println(n / 2);
            }

            n = scanner.nextInt();
        }
    }
}