package LQB.lqb3521;

import java.util.*;

//3 3 2 2
//1 2 3
//4 5 6
//7 8 9

public class Main {
    static int N = 1010;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //1.暴力解法，利用四层for循环，能解决70%
        //2.采用二维单调队列
        Scanner scan = new Scanner(System.in); //接受数据
        String str = scan.nextLine();
        String[] st = str.split(" ");
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);
        int a = Integer.parseInt(st[2]);
        int b = Integer.parseInt(st[3]);
        int[][] mat = new int[n][m];
        int[][] resMin = new int[N][N];
        int[][] resMax = new int[N][N];
        int[] Min = new int[N];
        int[] Max = new int[N];
        int[] rea = new int[N];
        int[] reb = new int[N];
        for (int i = 0; i < n; i++) {
            String s = scan.nextLine();
            String[] sub = s.split(" ");
            for (int j = 0; j < m; j++) {
                mat[i][j] = Integer.parseInt(sub[j]);
            }
        }
        for (int i = 0; i < n; i++) {//对每一行利用单调队列求最大最小值
            getMin(mat[i], m, b, resMin[i]);
            getMax(mat[i], m, b, resMax[i]);
        }
        long res = 0;
        for (int i = b - 1; i < m; i++) {//列
            for (int j = 0; j < n; j++) {//行
                rea[j] = resMin[j][i];
                reb[j] = resMax[j][i];
            }
            getMin(rea, n, a, Min);//对每一列元素求最小值，即操作rea，即每一列的最小值
            getMax(reb, n, a, Max);
            for (int j = a - 1; j < n; j++) {
                res = (res + 1L * Max[j] * Min[j]) % 998244353;
            }
        }

        System.out.println(res);
    }

    public static void getMin(int[] arr, int m, int k, int[] resMin) {
        int[] que = new int[m];//单调队列
        int head = 0, tail = -1;
        for (int i = 0; i < m; i++) {//遍历每一行

            //最小值
            while (head <= tail && arr[que[tail]] >= arr[i]) tail--;
            que[++tail] = i;
            if (que[head] < i - k + 1) head++;
            resMin[i] = arr[que[head]];
        }
    }

    public static void getMax(int[] arr, int m, int k, int[] resMax) {//单调队列求最大值
        int[] que = new int[m];//单调队列
        int head = 0, tail = -1;
        for (int i = 0; i < m; i++) {//遍历每一行

            //最大值
            while (head <= tail && arr[que[tail]] <= arr[i]) tail--;
            que[++tail] = i;
            if (que[head] < i - k + 1) head++;
            resMax[i] = arr[que[head]];
        }
    }
}