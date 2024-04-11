package LQB.lqb3525;

import java.math.BigInteger;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int size = scan.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            list[i] = scan.nextInt();
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (can(list[i], list[j])) {
                    System.out.println((i + 1) + " " + (j + 1));
                    scan.close();
                    return;
                }
            }
        }
        scan.close();
    }

    private static boolean can(int one, int two) {
        return !new BigInteger(String.valueOf(one)).gcd(new BigInteger(String.valueOf(two))).equals(BigInteger.ONE);
    }
}