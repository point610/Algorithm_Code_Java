package LQB.lqb17039;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                if (j - i >= 10) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}