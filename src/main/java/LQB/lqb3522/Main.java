package LQB.lqb3522;

import java.math.BigInteger;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        String[] split = scan.nextLine().split(" ");
        BigInteger one = new BigInteger(split[0]);
        BigInteger two = new BigInteger(split[1]);
        BigInteger end = one.pow(two.intValue());
        int sum = 0;
        for (BigInteger i = BigInteger.ONE; !i.equals(end); i = i.add(BigInteger.ONE)) {
            if (end.gcd(i).equals(BigInteger.ONE)) {
                sum++;
            }
        }
        System.out.println(sum);
        scan.close();
    }
}