package LQB.lqb17043;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        soluction(scan);
        scan.close();
    }

    private static int row;
    private static int col;

    private static void soluction(Scanner scan) {
        row = scan.nextInt();
        col = scan.nextInt();
        scan.nextLine();
        char[][] list = new char[row][col];
        for (int i = 0; i < row; i++) {
            list[i] = scan.nextLine().toCharArray();
        }
        int max = 0;
        for (int i = 1; i < row - 1; i++) {
            for (int j = 1; j < col - 1; j++) {
                max = Math.max(max, getmaxY(list, i, j));
            }
        }
        System.out.println(max);
    }

    private static boolean in(int x, int y) {
        return x >= 0 && x < row && y >= 0 && y < col;
    }


    private static int getmaxY(char[][] list, int x, int y) {

        return Math.min(Math.min(left(list, x, y, list[x][y]), right(list, x, y, list[x][y]))
                , down(list, x, y, list[x][y])) - 1;

    }

    private static int left(char[][] list, int x, int y, char cc) {
        int max = 0;
        while (in(x, y) && list[x][y] == cc) {
            x--;
            y--;
            max++;
        }
        return max;
    }

    private static int right(char[][] list, int x, int y, char cc) {
        int max = 0;
        while (in(x, y) && list[x][y] == cc) {
            x--;
            y++;
            max++;
        }
        return max;
    }

    private static int down(char[][] list, int x, int y, char cc) {
        int max = 0;
        while (in(x, y) && list[x][y] == cc) {
            x++;
            max++;
        }
        return max;
    }
}


