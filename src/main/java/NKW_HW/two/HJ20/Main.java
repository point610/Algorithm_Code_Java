package NKW_HW.two.HJ20;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            solution(scanner);
        }
    }

    public static void solution(Scanner scanner) {
        String ss = scanner.nextLine();
        if (ss.length() <= 8) {
            System.out.println("NG");
            return;
        }

        int type = 0;
        if (xiaoxie(ss)) {
            type++;
        }
        if (daxie(ss)) {
            type++;
        }
        if (shuzi(ss)) {
            type++;
        }
        if (other(ss)) {
            type++;
        }
        if (type < 3) {
            System.out.println("NG");
            return;
        }

        for (int i = 0; i < ss.length() - 2; i++) {
            String temp = ss.substring(i, i + 3);
            if (ss.indexOf(temp, i + 1) != -1) {
                System.out.println("NG");
                return;
            }
        }
        System.out.println("OK");
    }

    public static boolean xiaoxie(String ss) {
        for (int i = 0; i < ss.length(); i++) {
            if (Character.isLowerCase(ss.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean daxie(String ss) {
        for (int i = 0; i < ss.length(); i++) {
            if (Character.isUpperCase(ss.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean shuzi(String ss) {
        for (int i = 0; i < ss.length(); i++) {
            if (Character.isDigit(ss.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean other(String ss) {
        for (int i = 0; i < ss.length(); i++) {
            if (!(Character.isDigit(ss.charAt(i)) && Character.isUpperCase(ss.charAt(i)) && Character.isUpperCase(ss.charAt(i)))) {
                return true;
            }
        }
        return false;
    }
}












