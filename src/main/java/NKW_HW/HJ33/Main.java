package NKW_HW.HJ33;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] list = scanner.nextLine().split("\\.");
        Long l = scanner.nextLong();

        System.out.println(getOne(list));
        System.out.println(getTwo(l));

    }

    private static Long getOne(String[] list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            StringBuilder temp = new StringBuilder(Integer.toBinaryString(Integer.parseInt(list[i])));
            while (temp.length() != 8) {
                temp.insert(0, '0');
            }
            stringBuilder.append(temp);
        }
        return Long.parseLong(String.valueOf(stringBuilder), 2);

    }

    private static String getTwo(Long one) {
        StringBuilder ss = new StringBuilder(Long.toBinaryString(one));
        while (ss.length() != 32) {
            ss.insert(0, '0');
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            stringBuilder.append(Integer.parseInt(ss.substring(i * 8, i * 8 + 8), 2));
            if (i != 3) {
                stringBuilder.append('.');
            }
        }
        return stringBuilder.toString();
    }
}