package NKW_HW.two.HJ84;

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
        int sum = 0;
        for (int i = 0; i < ss.length(); i++) {
            if (Character.isUpperCase(ss.charAt(i))) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}












