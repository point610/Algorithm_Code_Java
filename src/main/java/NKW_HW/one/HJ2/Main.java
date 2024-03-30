package NKW_HW.one.HJ2;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        char cc = scanner.nextLine().toLowerCase().charAt(0);
        int count = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == cc) {
                count++;
            }
        }
        System.out.println(count);

    }
}