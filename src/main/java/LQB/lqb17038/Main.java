package LQB.lqb17038;

import java.math.BigInteger;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        System.out.println(new BigInteger("12345678901234567890123456789012345678901234567890").mod(new BigInteger("2023")));
        scan.close();
    }
}