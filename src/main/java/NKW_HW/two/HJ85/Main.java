package NKW_HW.two.HJ85;

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
        int max = 1;
        for (int i = 0; i < ss.length() - 1; i++) {
            max = Math.max(max, one(ss, i));
            max = Math.max(max, two(ss, i));
        }
        System.out.println(max);
    }

    public static int one(String one, int index) {
        int left = index - 1;
        int right = index + 1;

        while (0 <= left && right < one.length()) {
            if (one.charAt(left) != one.charAt(right)) {
                break;
            }
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static int two(String one, int index) {
        int left = index;
        int right = index + 1;

        while (0 <= left && right < one.length()) {
            if (one.charAt(left) != one.charAt(right)) {
                break;
            }
            left--;
            right++;
        }
        return right - left - 1;
    }
}












