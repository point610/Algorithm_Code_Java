package NKW_HW.one.HJ100;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int left = 2;
        int number = scanner.nextInt();
        int right = left + 3 * (number - 1);
        System.out.println((left + right) * number / 2);
    }
}