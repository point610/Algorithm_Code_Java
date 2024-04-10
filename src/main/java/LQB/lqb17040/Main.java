package LQB.lqb17040;

import java.math.BigInteger;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        System.out.println(5503);
        //Scanner scan = new Scanner(System.in);
        ////在此输入您的代码...
        //int sum = 0;
        //for (int i = 1; i <= 1000000; i++) {
        //    if (isprime(i)) {
        //        if (23 == getsum(i)) {
        //            sum++;
        //        }
        //    }
        //}
        //
        //System.out.println(sum);
        //scan.close();
    }

    private static boolean isprime(int one) {
        return new BigInteger(String.valueOf(one)).isProbablePrime(100);
    }

    private static int getsum(int one) {
        int sum = 0;
        while (one != 0) {
            sum += one % 10;
            one /= 10;
        }
        return sum;
    }
}