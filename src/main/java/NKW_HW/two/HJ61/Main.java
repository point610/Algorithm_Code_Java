package NKW_HW.two.HJ61;

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
        // 苹果
        int apples = scanner.nextInt();
        // 盘子
        int panels = scanner.nextInt();
        int[][] dp = new int[apples + 1][panels + 1];
        for (int i = 0; i <= apples; i++) {
            dp[i][1] = 1;
        }
        for (int i = 1; i <= panels; i++) {
            dp[1][i] = 1;
            dp[0][i] = 1;
        }

        for (int i = 2; i <= apples; i++) {
            for (int j = 1; j <= panels; j++) {
                dp[i][j] = dp[i][j - 1] + (i - j < 0 ? 0 : dp[i - j][j]);
            }
        }
        System.out.println(dp[apples][panels]);
    }
}












