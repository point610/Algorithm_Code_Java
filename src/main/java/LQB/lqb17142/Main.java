package LQB.lqb17142;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        long level = 1;
        long times = 1;
        long sum = 1;
        while (sum + level < 20230610) {
            sum += level;
            times++;
            level += times + 1;
        }
        System.out.println(times);
    }
}