package temp.tx.tx4;

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

    private static int max = 0;
    private static int[][] list;

    public static void solution(Scanner scanner) {
        int size = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        list = new int[size + 1][1 + size];
        for (int i = 0; i < size; i++) {
            list[i + 1][i + 1] = arr[i];
            for (int j = i + 1; j < size; j++) {
                list[i + 1][j + 1] = list[i + 1][j] ^ arr[j];
            }
        }
        int[][] dp = new int[k + 1][size + 1];
        for (int i = 1; i <= size; i++) {
            dp[1][i] = list[1][i];
        }

        // 次数
        for (int i = 2; i <= k; i++) {
            for (int j = i; j <= size; j++) {
                for (int l = 0; l <= j; l++) {
                    if (l == j) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][l]);
                    } else {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][l] + list[l + 1][j]);
                    }
                }
            }
        }
        System.out.println(dp[k][size]);
    }

    //public static void dfs(int k, int start, int sum) {
    //    if (k == 0 && start == list.length) {
    //        max = Math.max(max, sum);
    //        return;
    //    }
    //    if (k == 0 || start == list.length) {
    //        return;
    //    }
    //    for (int i = start; i < list.length; i++) {
    //        dfs(k - 1, i + 1, sum + list[start][i]);
    //    }
    //}
}














