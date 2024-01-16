package NKW_HW.HJ17;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        long x = 0;
        long y = 0;
        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split(";");
        for (String ss : split) {
            if (ss.isEmpty()) {
                continue;
            }
            char to = ss.charAt(0);
            if (to != 'A' && to != 'D' && to != 'W' && to != 'S') {
                continue;
            }
            int number = -1;
            try {
                number = Integer.parseInt(ss.substring(1));
            } catch (Exception e) {
                continue;
            }
            switch (to) {
                case 'A': {
                    x -= number;
                    break;
                }
                case 'D': {
                    x += number;
                    break;
                }
                case 'W': {
                    y += number;
                    break;
                }
                case 'S': {
                    y -= number;
                    break;
                }
            }

        }
        System.out.print(x);
        System.out.print(',');
        System.out.print(y);

    }
}