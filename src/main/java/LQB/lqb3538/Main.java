package LQB.lqb3538;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    private static int size;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        soluction(scan);
        scan.close();
    }

    private static void soluction(Scanner scan) {
        size = scan.nextInt();
        int[][] one = new int[size][size];
        int[][] two = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                one[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                two[i][j] = scan.nextInt();
            }
        }
        int oneedge = get(one, size);
        int twoedge = get(two, size);
        if (oneedge != 0 && twoedge != 0) {
            System.out.println(oneedge + twoedge);
        } else {
            System.out.println(Math.max(getall(one, size),getall(two, size)));
        }

    }

    private static int tempsum;

    private static void dfs(int[][] one, boolean[][] visit, int x, int y) {
        if (!in(x, y) || visit[x][y] || one[x][y] != 1) {
            return;
        }
        visit[x][y] = true;
        tempsum++;
        dfs(one, visit, x + 1, y);
        dfs(one, visit, x - 1, y);
        dfs(one, visit, x, y + 1);
        dfs(one, visit, x, y - 1);

    }

    private static boolean in(int x, int y) {
        return x >= 0 && x < size && y >= 0 && y < size;
    }

    private static int get(int[][] one, int size) {
        int max = 0;
        boolean[][] visit = new boolean[size][size];

        for (int i = 0; i < size; i++) {
            tempsum = 0;
            dfs(one, visit, i, 0);
            max = Math.max(max, tempsum);
        }
        for (int i = 0; i < size; i++) {
            tempsum = 0;
            dfs(one, visit, i, size - 1);
            max = Math.max(max, tempsum);
        }
        for (int i = 0; i < size; i++) {
            tempsum = 0;
            dfs(one, visit, size - 1, i);
            max = Math.max(max, tempsum);
        }
        for (int i = 0; i < size; i++) {
            tempsum = 0;
            dfs(one, visit, 0, i);
            max = Math.max(max, tempsum);
        }
        return max;
    }

    private static int getall(int[][] one, int size) {
        int max = 0;
        boolean[][] visit = new boolean[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                tempsum = 0;
                dfs(one, visit, i, j);
                max = Math.max(max, tempsum);
            }
        }

        return max;
    }
}
















