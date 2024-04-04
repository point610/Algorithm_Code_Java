package NKW_HW.two.HJ96;

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
        String one = scanner.nextLine();
        int size = one.length();
        StringBuilder stringBuilder = new StringBuilder();
        if (Character.isDigit(one.charAt(0))) {
            stringBuilder.append('*');
        }
        stringBuilder.append(one.charAt(0));
        for (int i = 1; i < size; i++) {
            char o = one.charAt(i - 1);
            char t = one.charAt(i);
            if (Character.isDigit(o) && Character.isDigit(t)) {
                stringBuilder.append(t);
            } else if (Character.isDigit(o)) {
                stringBuilder.append('*');
                stringBuilder.append(t);
            } else if (Character.isDigit(t)) {
                stringBuilder.append('*');
                stringBuilder.append(t);
            } else {
                stringBuilder.append(t);
            }
        }
        if (Character.isDigit(stringBuilder.charAt(stringBuilder.length() - 1))) {
            stringBuilder.append('*');
        }
        System.out.println(stringBuilder);
    }
}








