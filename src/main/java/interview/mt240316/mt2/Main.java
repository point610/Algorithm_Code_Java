package interview.mt240316.mt2;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            String ss = scanner.nextLine();
            if (ss.length() <= 1) {
                System.out.println(0);
                return;
            }
            int one = 0;
            for (int i = 0; i < ss.length(); i++) {
                char cc = ss.charAt(i);
                if ('A' <= cc && cc <= 'Z') {
                    one++;
                }
            }

            if (one == 1 && 'A' <= ss.charAt(0) && ss.charAt(0) <= 'Z') {
                System.out.println(0);
            } else {
                int temp = Math.min(one, ss.length() - one);
                System.out.println(Math.min(temp, getmin(ss)));
            }
        }
    }

    private static int getmin(String ss) {
        int times = 0;
        if (Character.isLowerCase(ss.charAt(0))) {
            times++;
        }
        for (int i = 1; i < ss.length(); i++) {
            if (Character.isUpperCase(ss.charAt(i))) {
                times++;
            }
        }
        return times;
    }
}














