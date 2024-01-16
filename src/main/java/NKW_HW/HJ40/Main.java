package NKW_HW.HJ40;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ss = scanner.nextLine();
        int yw = 0;
        int kg = 0;
        int sz = 0;
        int qt = 0;
        int size = ss.length();
        for (int i = 0; i < size; i++) {
            char cc = ss.charAt(i);
            if ('0' <= cc && cc <= '9') {
                sz++;
            } else if (cc == ' ') {
                kg++;
            } else if ('a' <= cc && cc <= 'z' || 'A' <= cc && cc <= 'Z') {
                yw++;
            } else {
                qt++;
            }
        }
        System.out.println(yw);
        System.out.println(kg);
        System.out.println(sz);
        System.out.println(qt);
    }
}