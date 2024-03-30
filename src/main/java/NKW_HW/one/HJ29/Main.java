package NKW_HW.one.HJ29;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String one = scanner.nextLine();
        String two = scanner.nextLine();
        System.out.println(jiami(one));
        System.out.println(jiemi(two));


    }

    private static String jiemi(String one) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character cc : one.toCharArray()) {
            if (Character.isUpperCase(cc)) {
                cc = Character.toLowerCase(cc);
                cc = (char) ((cc - 'a' - 1 + 26) % 26 + 'a');

            } else if (Character.isLowerCase(cc)) {
                cc = Character.toUpperCase(cc);
                cc = (char) ((cc - 'A' - 1 + 26) % 26 + 'A');

            } else if (Character.isDigit(cc)) {
                cc = (char) ((cc - '0' - 1 + 10) % 10 + '0');
            }
            stringBuilder.append(cc);
        }
        return stringBuilder.toString();
    }

    private static String jiami(String one) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character cc : one.toCharArray()) {
            if (Character.isUpperCase(cc)) {
                cc = Character.toLowerCase(cc);
                cc = (char) ((cc - 'a' + 1) % 26 + 'a');

            } else if (Character.isLowerCase(cc)) {
                cc = Character.toUpperCase(cc);
                cc = (char) ((cc - 'A' + 1) % 26 + 'A');

            } else if (Character.isDigit(cc)) {
                cc = (char) ((cc - '0' + 1) % 10 + '0');
            }
            stringBuilder.append(cc);
        }
        return stringBuilder.toString();
    }
}