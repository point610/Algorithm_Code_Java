package temp.bz.two;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNextLine()) { // 注意 while 处理多个 case
            soluction(scanner);
        }
    }

    private static void soluction(Scanner scanner) {
        int size = scanner.nextInt();
        int index = scanner.nextInt();
        scanner.nextLine();
        String ss = scanner.nextLine();
        if ((size - index + 1) % 2 == 0) {
            String one = ss.substring(0, index - 1);
            String two = ss.substring(index - 1);
            System.out.println(two + one);

        } else {
            String one = ss.substring(0, index - 1);
            String two = ss.substring(index - 1);
            System.out.println(two + new StringBuilder(one).reverse());

        }

    }
}