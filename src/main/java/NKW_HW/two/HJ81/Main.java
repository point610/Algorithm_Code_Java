package NKW_HW.two.HJ81;

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
        char[] two = scanner.nextLine().toCharArray();
        char[] one = scanner.nextLine().toCharArray();
        Set<Character> set = new HashSet<>();
        for (char cc : one) {
            set.add(cc);
        }
        for (char cc : two) {
            if (!set.contains(cc)) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}












