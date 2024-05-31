package LQB.lqb17121;

import java.util.Arrays;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        System.out.println(590);

    }

    private static boolean is(int one) {
        for (int i = 1; i < one; i++) {
            if (one % i == 0) {
                int j = one / i;
                if (i * j == one && getString(String.valueOf(one)).equals(getString(String.valueOf(i) + j))) {
                    return true;
                }
            }
        }
        return false;
    }

    private static String getString(String one) {

        char[] charArray = one.toCharArray();
        Arrays.sort(charArray);

        return new String(charArray);
    }


}












