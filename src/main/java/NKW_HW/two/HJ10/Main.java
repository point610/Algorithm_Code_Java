package NKW_HW.two.HJ10;

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
        String ss = scanner.nextLine();
        Set<Character> set = new HashSet<>();
        for (char c : ss.toCharArray()) {
            set.add(c);
        }
        System.out.println(set.size());
    }
}





































