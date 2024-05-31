package LQB.lqb18427;

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
        int size = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextLine();
        }

        int[][] dp = new int[size][2];

        dp[0][0] = 2;
        dp[0][1] = 2;
        for (int i = 1; i < size; i++) {

            dp[i][0] = Math.min(dp[i - 1][0], dp[i - 1][1]) + 2;
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][1]) + 2;

            if (arr[i].charAt(0) == arr[i - 1].charAt(0)) {
                dp[i][0] = Math.min(dp[i][0], dp[i - 1][1] + 1);
            }
            if (arr[i].charAt(0) == arr[i - 1].charAt(1)) {
                dp[i][0] = Math.min(dp[i][0], dp[i - 1][0] + 1);
            }

            if (arr[i].charAt(1) == arr[i - 1].charAt(0)) {
                dp[i][1] = Math.min(dp[i][1], dp[i - 1][1] + 1);
            }
            if (arr[i].charAt(1) == arr[i - 1].charAt(1)) {
                dp[i][1] = Math.min(dp[i][1], dp[i - 1][0] + 1);
            }

        }
        System.out.println(Math.min(dp[size - 1][0], dp[size - 1][1]));

    }
}












