package NKW_HW.one.HJ39;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String zi = scanner.nextLine();
            String one = scanner.nextLine();
            String two = scanner.nextLine();
            if (!getzi(zi) || !getone(one) || !getone(two)) {
                System.out.println(1);
                continue;
            }

            Long lzi = getLong(zi);
            Long lone = getLong(one);
            Long ltwo = getLong(two);
            if ((lzi & lone) == (lzi & ltwo)) {
                System.out.println(0);
            } else {
                System.out.println(2);
            }
        }
    }

    private static Long getLong(String one) {
        String[] split = one.split("\\.");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            stringBuilder.append(getbit(split[i]));
        }
        return Long.parseLong(stringBuilder.toString(), 2);

    }

    private static boolean getone(String one) {
        String[] split = one.split("\\.");
        for (int i = 0; i < 4; i++) {
            if (!isin(split[i])) {
                return false;
            }
        }
        return true;
    }

    private static String getbit(String one) {
        StringBuilder ss = new StringBuilder(Integer.toBinaryString(Integer.parseInt(one)));
        while (ss.length() != 8) {
            ss.insert(0, '0');
        }
        return ss.toString();
    }

    private static boolean isin(String one) {
        int temp = Integer.parseInt(one);
        return 0 <= temp && temp <= 255;
    }

    private static boolean getzi(String zi) {
        String[] split = zi.split("\\.");
        for (int i = 0; i < 4; i++) {
            if (!isin(split[i])) {
                return false;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            stringBuilder.append(getbit(split[i]));
        }
        boolean sign = stringBuilder.charAt(0) == '1';
        for (int i = 0; i < 32; i++) {
            if (stringBuilder.charAt(i) == '1') {
                if (sign) {

                } else {
                    return false;
                }
            } else {
                if (sign) {
                    sign = false;
                }
            }
        }
        return true;

    }

}