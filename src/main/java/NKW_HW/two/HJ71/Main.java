package NKW_HW.two.HJ71;

import java.util.Locale;
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
        String pattern = scanner.nextLine();
        String ss = scanner.nextLine();

        // 都转换为小写
        pattern = pattern.toLowerCase(Locale.ROOT);
        ss = ss.toLowerCase(Locale.ROOT);

        // 将多个连续的* 转换为一个*
        pattern= pattern.replaceAll("\\*{2,}", "\\*");
        pattern= pattern.replaceAll("\\?", "[0-9a-z]{1}");
        pattern = pattern.replaceAll("\\*", "[0-9a-z]{0,}");
        System.out.println(ss.matches(pattern));
    }
}












