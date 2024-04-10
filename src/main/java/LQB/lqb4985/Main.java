package LQB.lqb4985;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改
//https://www.lanqiao.cn/problems/4985/learning/?problem_list_id=2&page=1&tags=2023

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n + 1];
        int[] a = new int[n + 1];
        int[] b = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            a[i] = sc.nextInt();
            b[i + 1] = sc.nextInt();
        }

        double[][] dp = new double[n + 1][2];
        dp[1][0] = x[1];
        dp[1][1] = x[1] + a[1] / 0.7;


        for (int i = 2; i <= n; i++) {
            if (a[i] > b[i]) {
                dp[i][1] = Math.min(dp[i - 1][0] + x[i] - x[i - 1] + a[i] / 0.7, dp[i - 1][1] + (a[i] - b[i]) / 0.7);
            } else {
                dp[i][1] = Math.min(dp[i - 1][0] + x[i] - x[i - 1] + a[i] / 0.7, dp[i - 1][1] + (b[i] - a[i]) / 1.3);
            }
            dp[i][0] = Math.min(dp[i - 1][1] + b[i] / 1.3, dp[i - 1][0] + x[i] - x[i - 1]);

        }

        System.out.printf("%.2f", dp[n][0]);
        //在此输入您的代码...
        sc.close();
    }
}