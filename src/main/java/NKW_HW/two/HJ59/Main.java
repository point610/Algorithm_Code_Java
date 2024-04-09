package NKW_HW.two.HJ59;

import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

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
        String one = scanner.nextLine();
        int[] list = new int[26];
        for (char c : one.toCharArray()) {
            list[c - 'a']++;
        }
        boolean find = false;
        for (char c : one.toCharArray()) {
            if (list[c - 'a'] == 1) {
                System.out.println(c);
                find = true;
                break;
            }
        }

        if (!find) {
            System.out.println(-1);
        }

    }
}












