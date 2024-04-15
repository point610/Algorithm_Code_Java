package NKW_HW.two.HJ75;

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
        String two = scanner.nextLine();

        if (one.length() > two.length()) {
            System.out.println(get(two, one));
        } else {
            System.out.println(get(one, two));
        }

    }

    public static int get(String one, String two) {
        for (int i = one.length(); i >= 1; i--) {
            for (int j = 0; j < one.length() && i + j <=one.length(); j++) {
                String temp = one.substring(j, j + i);
                if (two.contains(temp)) {
                    return temp.length();
                }
            }
        }
        return 0;
    }
}












