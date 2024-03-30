package NKW_HW.one.HJ61;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(count(m, n));
        }
    }

    // 递归功能：当前持有m个苹果，有n个盘子可供存放，返回摆放方案数
    private static int count(int m, int n) {
        // 递归出口：当苹果数m=0， 此时表示什么都不做，输出1种方案，再递归下去m<0，题目要求m>=0
        // 当盘子只有一个时，剩下的苹果m只能全部摆放这个盘子，递归返回1种方案，再递归下去n==0, 题目要求n>=1
        if (m == 0 || n == 1) {
            return 1;
        }
        // 当盘子数大于苹果数，一定有n-m个盘子空着，而且每个盘子都一样，因此count(m,n)==count(m,n-1)
        if (n > m) {
            return count(m, n - 1);
        } else {
            // 当盘子数<=苹果数，有两种情况：
            // 1.至少有一个盘子可以不放，因此count(m, n-1)
            // 2.至少每个盘子都有一个苹果，摆放后苹果数为(m-n)，因此coutn(m-n, n)
            return count(m, n - 1) + count(m - n, n);
        }
    }
}

