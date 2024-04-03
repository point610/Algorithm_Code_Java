package LQB.lqb2141;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        System.out.println(3138);
        //int sum = 0;
        //for (int i = 2022; i <= 2022222022; i++) {
        //    if (is(i)) {
        //        sum++;
        //    }
        //}
        //System.out.println(sum);
    }

    private static boolean is(int one) {
        String ss = String.valueOf(one);
        int size = ss.length();

        for (int i = 0; i < (size - 1) / 2; i++) {
            if (ss.charAt(i) > ss.charAt(i + 1)) {
                return false;
            }

        }
        int left = 0;
        int right = size - 1;
        while (left < right) {
            if (ss.charAt(left) != ss.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}