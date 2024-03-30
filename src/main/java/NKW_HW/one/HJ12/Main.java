package NKW_HW.one.HJ12;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
        stringBuilder = stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}