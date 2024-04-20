package temp.bz.one;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            soluction(scanner);
        }
    }

    private static void soluction(Scanner scanner) {
        int size = scanner.nextInt();
        long res = (long) (size - 1) * size + 1;
        System.out.println(res);
    }
}