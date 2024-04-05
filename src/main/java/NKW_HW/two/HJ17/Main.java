package NKW_HW.two.HJ17;

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
        String[] split = scanner.nextLine().split(";");
        int x = 0, y = 0;
        for (String ss : split) {
            if (ss.isEmpty()) {
                continue;
            }
            char type = ss.charAt(0);
            int step = 0;
            try {
                step = Integer.valueOf(ss.substring(1));
            } catch (Exception e) {
                continue;
            }
            //A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动
            switch (type) {
                case 'A': {
                    x -= step;
                    break;
                }
                case 'D': {
                    x += step;
                    break;
                }
                case 'W': {
                    y += step;
                    break;
                }
                case 'S': {
                    y -= step;
                    break;
                }
            }

        }
        System.out.println(x + "," + y);
    }
}












