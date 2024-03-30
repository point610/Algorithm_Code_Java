package NKW_HW.one.HJ62;

import java.math.BigInteger;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) { // 注意 while 处理多个 case
            System.out.println(new BigInteger(String.valueOf(scanner.nextInt())).bitCount());
        }
    }
}