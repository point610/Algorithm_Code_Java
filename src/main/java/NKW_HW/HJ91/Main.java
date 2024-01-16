package NKW_HW.HJ91;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] list = new int[m][n];
        list[0][0] = 2;
        for (int i = 1; i < n; i++) {
            list[0][i] = list[0][i - 1] + 1;
        }
        for (int i = 1; i < m; i++) {
            list[i][0] = list[i - 1][0] + 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                list[i][j] = list[i - 1][j] + list[i][j - 1];
            }
        }
        System.out.println(list[m - 1][n - 1]);
    }
}