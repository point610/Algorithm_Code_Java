package NKW_HW.two.HJ90;

import java.util.Scanner;

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
        String[] split = ss.split("\\.");
        if (split.length != 4) {
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (!isValidIp(split[i])) {
                System.out.println("NO");
                return;
            }
            int ii = -1;
            try {
                ii = Integer.parseInt(split[i]);
            } catch (Exception e) {
                System.out.println("NO");
                return;
            }
            if (!(0 <= ii && ii <= 255)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static boolean isValidIp(String one) {
        if (one == null || one.isEmpty() || one.length() > 3 || !Character.isDigit(one.charAt(0)) ||
                (one.charAt(0) == '0' && one.length() > 1)) {
            return false;
        }
        return true;
    }
}












