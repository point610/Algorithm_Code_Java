package NKW_HW.two.HJ22;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int temp = scanner.nextInt();
        while (temp != 0) { // 注意 while 处理多个 case

            solution(temp);

            temp = scanner.nextInt();
        }
    }

    public static void solution(int one) {
        int sum = 0;
        while (one >= 3) {
            sum += one / 3;

            one = (one / 3) + one % 3;
        }
        if (one == 2) {
            sum++;
        }
        System.out.println(sum);
    }
}












