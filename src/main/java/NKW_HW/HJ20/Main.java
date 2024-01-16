package NKW_HW.HJ20;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String ss = in.nextLine();
            if (check(ss)) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        }
    }

    private static boolean check(String ss) {
        int size = ss.length();
        if (size <= 8) {
            return false;
        }

        boolean daxie = false;
        boolean xiaoxie = false;
        boolean shuzi = false;
        boolean qita = false;
        for (int i = 0; i < size; i++) {
            if (Character.isDigit(ss.charAt(i))) {
                shuzi = true;
            } else if (Character.isLowerCase(ss.charAt(i))) {
                xiaoxie = true;
            } else if (Character.isUpperCase(ss.charAt(i))) {
                daxie = true;
            } else {
                qita = true;
            }
        }
        int times = 0;
        if (daxie) {
            times++;
        }
        if (xiaoxie) {
            times++;
        }
        if (shuzi) {
            times++;
        }
        if (qita) {
            times++;
        }
        if (times <= 2) {
            return false;
        }

        for (int i = 0; i < size - 2; i++) {
            String temp = ss.substring(i, i + 3);
            if (ss.indexOf(temp, i + 1) != -1) {
                return false;
            }
        }
        return true;

    }
}