package NKW_HW.HJ57;

import java.math.BigInteger;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) {
            BigInteger one = new BigInteger(scanner.nextLine());
            BigInteger two = new BigInteger(scanner.nextLine());
            System.out.println(one.add(two));

        }
    }
}