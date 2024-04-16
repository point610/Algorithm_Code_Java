package NKW_HW.two.HJ39;

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
        String zi = scanner.nextLine();
        String ipone = scanner.nextLine();
        String iptwo = scanner.nextLine();

        if (!iszi(zi) || !isip(ipone) || !isip(iptwo)) {
            System.out.println("1");
            return;
        }

        String[] ziwang = zi.split("\\.");
        String[] one = ipone.split("\\.");
        String[] two = iptwo.split("\\.");

        for (int i = 0; i < 4; i++) {
            if (get(ziwang[i], one[i]) != get(ziwang[i], two[i])) {
                System.out.println("2");
                return;
            }
        }
        System.out.println("0");
    }

    private static boolean iszi(String one) {
        String[] split = one.split("\\.");
        if (split.length != 4) {
            return false;
        }
        for (String ss : split) {
            for (char cc : ss.toCharArray()) {
                if (!Character.isDigit(cc)) {
                    return false;
                }
            }
        }

        try {
            StringBuilder stringBuilder = new StringBuilder();
            for (String ss : split) {
                int ii = Integer.parseInt(ss);
                if (ii < 0 || ii > 255) {
                    return false;
                }
                StringBuilder temp = new StringBuilder(Integer.toBinaryString(ii));
                while (temp.length() != 8) {
                    temp.insert(0, '0');
                }
                stringBuilder.append(temp);
            }
            int index = 0;
            while (index < stringBuilder.length() && stringBuilder.charAt(index) == '1') {
                index++;
            }
            while (index < stringBuilder.length()) {
                if (stringBuilder.charAt(index) == '1') {
                    return false;
                }
                index++;
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private static boolean isip(String one) {
        String[] split = one.split("\\.");
        if (split.length != 4) {
            return false;
        }
        for (String ss : split) {
            for (char cc : ss.toCharArray()) {
                if (!Character.isDigit(cc)) {
                    return false;
                }
            }
        }

        for (String ss : split) {
            int ii = Integer.parseInt(ss);
            if (ii < 0 || ii > 255) {
                return false;
            }
        }

        return true;
    }

    private static int get(String one, String two) {
        int oo = Integer.parseInt(one);
        int tt = Integer.parseInt(two);
        return oo & tt;
    }

}












