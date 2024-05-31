package LQB.lqb17147;

import java.util.Scanner;
//1:无需package
//2: 类名必须Main, 不可修改

public class Main {
    static int[][] arr;
    static int n;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        arr = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        int max = getMax();

        for (int i = 0; i < 3; i++) {
            arr = xzArr(arr);
            max = Math.max(max, getMax());
        }
        System.out.println(max);
        scan.close();
    }

    public static int[][] xzArr(int[][] arr) {
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = arr[n - j - 1][i];
            }
        }
        return a;
    }

    public static int getMax() {
        int result = -1;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = 1;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i - 1][j] == arr[i][j - 1] && arr[i][j] == arr[i][j - 1]) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
                    result = Math.max(dp[i][j], result);
                }
            }
        }
        return result;
    }

}












