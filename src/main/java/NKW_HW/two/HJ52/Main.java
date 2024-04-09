package NKW_HW.two.HJ52;

import java.util.HashMap;
import java.util.Map;
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
        int[][] dp = new int[one.length() + 1][two.length() + 1];
        for (int i = 0; i < one.length(); i++) {
            dp[i + 1][0] = dp[i][0] + 1;
        }
        for (int i = 0; i < two.length(); i++) {
            dp[0][i + 1] = dp[0][i] + 1;
        }

        for (int i = 1; i <= one.length(); i++) {
            for (int j = 1; j <= two.length(); j++) {
                if (one.charAt(i - 1) == two.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1] + 1, Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1));
                }
            }
        }
        System.out.println(dp[one.length()][two.length()]);
    }
}












