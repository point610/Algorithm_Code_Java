package NKW_HW.two.HJ6;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            solution(scanner);
        }
    }

    public static void solution(Scanner scanner) {
        long num = scanner.nextLong();
        long size = (long) Math.sqrt(num);
        for (int i = 2; i <= size; i++) {
            while (num % i == 0) {
                System.out.print(i );
                System.out.print(' ');
                num /= i;
            }
        }
        // 最后对结果进行判断
        // 有可能上面没有一个可以运算的
        System.out.println(num == 1 ? "": num+" ");
    }
}




































