package NKW_HW.two.HJ72;

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
        scanner.nextInt();
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 33; j++) {
                for (int k = 0; k <= 100; k += 3) {
                    if ((i + j + k) == 100 && (i * 5 + j * 3 + k / 3) == 100) {
                        System.out.println(i + " " + j + " " + k );
                    }
                }
            }
        }
    }
}












