package LQB.lqb2360;

import java.math.BigInteger;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        solution(scanner);
    }

    public static void solution(Scanner scanner) {
        int res = 0;
        for (int i = 1; i <= 2020; i++) {
            if (is(i, 1018)) {
                res++;
            }
        }
        System.out.println(res);
    }

    private static boolean is(int one, int two) {
        return new BigInteger(String.valueOf(one)).gcd(new BigInteger(String.valueOf(two))).equals(BigInteger.ONE);
    }
}












