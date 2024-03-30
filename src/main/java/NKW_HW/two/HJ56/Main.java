package NKW_HW.two.HJ56;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        int one = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= one; i++) {
            if (getsum(i) == i) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    private static int getsum(int one) {
        int sum = 1;
        int size = (int) (Math.sqrt(one) + 1);
        for (int i = 2; i <= size; i++) {
            if (one % i == 0) {
                sum += i;
                sum += (one / i);
            }
        }
        return sum;
    }
}












