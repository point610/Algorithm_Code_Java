package NKW_HW.two.HJ33;

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
        if (ss.contains(".")) {
            String[] split = ss.split("\\.");

            long sum = 0;
            for (int i = split.length - 1, j = 0; i >= 0; j++, i--) {
                sum += (Long.valueOf(split[i])) << (j * 8);
            }
            System.out.println(sum);
        } else {
            Long ll = Long.parseLong(ss);
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 1; i <= 4; i++) {
                stringBuilder.insert(0, (ll % (1L << (8))));
                ll >>= 8;
                if (i != 4) {
                    stringBuilder.insert(0, '.');
                }
            }
            System.out.println(stringBuilder);
        }
    }
}












