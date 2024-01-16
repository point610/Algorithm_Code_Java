package NKW_HW.HJ5;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine().substring(2);
        int res = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            char cc = s.charAt(i);
            int temp = 0;
            if ('0' <= cc && cc <= '9') {
                temp = cc - '0';
            } else {
                temp = 10 + (cc - 'A');
            }
            res = res * 16 + temp;
        }
        System.out.println(res);
    }
}