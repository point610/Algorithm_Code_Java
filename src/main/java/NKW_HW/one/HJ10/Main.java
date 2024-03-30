package NKW_HW.one.HJ10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ss = scanner.nextLine();
        int size = ss.length();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(ss.charAt(i));
        }

        System.out.println(set.size());
    }
}