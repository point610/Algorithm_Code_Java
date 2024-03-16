package LQB.lqb43710;


import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    private static int times;
    private static int startX;
    private static int startY;
    private static int size;
    private static char[][] list;
    private static boolean[][] visit;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        times = Integer.MAX_VALUE ;
        size = scan.nextInt();
        list = new char[size][];
        visit = new boolean[size][size];
        scan.nextLine();
        for (int i = 0; i < size; i++) {
            list[i] = scan.nextLine().replaceAll(" ", "").toCharArray();
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == 'A') {
                    startX = i;
                    startY = j;
                }
            }
        }
        visit[startX][startY] = true;

        DFS(startX - 1, startY, '-', 0);
        DFS(startX, startY + 1, '-', 0);
        DFS(startX, startY - 1, '-', 0);
        DFS(startX + 1, startY, '-', 0);

        DFS(startX - 1, startY, '+', 0);
        DFS(startX, startY + 1, '+', 0);
        DFS(startX, startY - 1, '+', 0);
        DFS(startX + 1, startY, '+', 0);

        if (times==Integer.MAX_VALUE){
            System.out.println(-1);
        }else {
            System.out.println(times + 1);
        }

        //在此输入您的代码...
        scan.close();
    }

    private static boolean in(int x, int y) {
        return 0 <= x && x < size && 0 <= y && y < size;
    }

    private static void DFS(int x, int y, char value, int temp) {
        if (!in(x, y) || visit[x][y]) {
            return;
        }

        if (list[x][y] == 'B') {
            times = Math.min(times, temp);
            return;
        }

        if (list[x][y] != value) {
            return;
        }

        visit[x][y] = true;

        if (value == '-') {
            DFS(x - 1, y, '+', temp + 1);
            DFS(x, y + 1, '+', temp + 1);
            DFS(x + 1, y, '+', temp + 1);
            DFS(x, y - 1, '+', temp + 1);
        } else {
            DFS(x - 1, y, '-', temp + 1);
            DFS(x, y + 1, '-', temp + 1);
            DFS(x + 1, y, '-', temp + 1);
            DFS(x, y - 1, '-', temp + 1);
        }

        visit[x][y] = false;
    }
}









