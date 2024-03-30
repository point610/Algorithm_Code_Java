package NKW_HW.one.HJ108;

import java.math.BigInteger;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long one = scanner.nextInt();
        long two = scanner.nextInt();
        long gcd = new BigInteger(String.valueOf(one)).gcd(new BigInteger(String.valueOf(two))).longValue();
        System.out.println(one * two / gcd);

    }
}