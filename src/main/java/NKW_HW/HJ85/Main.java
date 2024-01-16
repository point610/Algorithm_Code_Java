package NKW_HW.HJ85;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ss = scanner.nextLine();
        int size = ss.length();
        for (int i = size; i >= 0; i--) {
            for (int j = 0; (j + i) <= size; j++) {
                String sub = ss.substring(j, j + i);
                if (ishuiwen(sub)) {
                    System.out.println(i );
                    return;
                }
            }
        }
    }

    private static boolean ishuiwen(String one) {
        int size = one.length();
        for (int i = 0, j = size - 1; i < j; j--, i++) {
            if (one.charAt(i) != one.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}