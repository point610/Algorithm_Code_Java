package LQB.lqb3499;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        int index = 0;
        int times = 0;
        while (times != 2023) {
            index++;
            if (can(index)) {
                times++;
            }
        }
        System.out.println(index);
    }

    private static boolean can(int one) {
        return (one % get2(one) == 0) && (one % get8(one) == 0) && (one % get10(one) == 0) && (one % get16(one) == 0);
    }

    private static int get2(int one) {
        return Integer.bitCount(one);
    }

    private static int get8(int one) {
        int sum = 0;
        while (one != 0) {
            sum += one % 8;
            one /= 8;
        }
        return sum;
    }

    private static int get10(int one) {
        int sum = 0;
        while (one != 0) {
            sum += one % 10;
            one /= 10;
        }
        return sum;
    }

    private static int get16(int one) {
        int sum = 0;
        while (one != 0) {
            sum += one % 16;
            one /= 16;
        }
        return sum;
    }


}