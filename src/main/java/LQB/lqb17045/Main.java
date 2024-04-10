package LQB.lqb17045;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        System.out.println(171248);
        //Scanner scan = new Scanner(System.in);
        ////在此输入您的代码...
        //int row = 30;
        //int col = 20;
        //int[][] list = new int[row][col];
        //for (int i = 0; i < row; i++) {
        //    for (int j = 0; j < col; j++) {
        //        list[i][j] = scan.nextInt();
        //    }
        //}
        //int max = 0;
        //for (int i = 0; i < row - 4; i++) {
        //    for (int j = 0; j < col - 4; j++) {
        //        max = Math.max(max, getsum(list, i, j));
        //    }
        //}
        //System.out.println(max);
        //scan.close();
    }

    private static int getsum(int[][] list, int x, int y) {
        int sum = 0;
        for (int i = x; i < x + 5; i++) {
            for (int j = y; j < y + 5; j++) {
                sum += list[i][j];
            }
        }
        return sum;
    }
}