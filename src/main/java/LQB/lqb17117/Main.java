package LQB.lqb17117;

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
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int[] value = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            value[i] = scanner.nextInt();
        }

        int[][][] dp = new int[A + 1][B + 1][N + 1];
        for (int i = 0; i <= A; i++) {
            for (int j = 0; j <= B; j++) {
                for (int k = 1; k <= N; k++) {
                    int temp = value[k];
                    dp[i][j][k] = dp[i][j][k - 1];

                    if (i - temp >= 0) {
                        dp[i][j][k] = Math.max(dp[i][j][k], dp[i - temp][j][k - 1] + temp);
                    }
                    if (j - temp >= 0) {
                        dp[i][j][k] = Math.max(dp[i][j][k], dp[i][j - temp][k - 1] + temp);
                    }
                }
            }
        }
        System.out.println(dp[A][B][N]);
    }
}












