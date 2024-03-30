package NKW_HW.two.HJ9;

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
        Set<Integer> set = new HashSet<>();
        int number = scanner.nextInt();
        int res = 0;
        while (number != 0) {
            int temp = number % 10;
            if (!set.contains(temp)) {
                res = res * 10 + temp;
                set.add(temp);
            }
            number /= 10;
        }
        System.out.println(res);
    }
}




















