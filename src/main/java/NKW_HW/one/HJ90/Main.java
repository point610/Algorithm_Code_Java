package NKW_HW.one.HJ90;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String one = scanner.nextLine();
            if (get(one)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean get(String one) {
        String[] split = one.split("\\.");
        if (split.length != 4) {
            return false;
        }
        for (String ss : split) {
            try {
                if (ss.length() != 1 && ss.indexOf('0') == 0||ss.charAt(0)=='+') {
                    return false;
                }
                int count = Integer.parseInt(ss);
                if (!(0 <= count && count <= 255)) {
                    return false;
                }
            } catch (Exception e) {
                return false;
            }

        }
        return true;

    }
}