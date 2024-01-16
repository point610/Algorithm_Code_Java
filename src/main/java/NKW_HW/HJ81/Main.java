package NKW_HW.HJ81;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            String one = scanner.nextLine();
            String two = scanner.nextLine();
            System.out.println(has(one, two));
        }
    }

    private static boolean has(String one, String two) {
        int[] oo = new int[26];
        int[] tt = new int[26];
        for (int i = 0; i < one.length(); i++) {
            oo[one.charAt(i) - 'a']++;
        }
        for (int i = 0; i < two.length(); i++) {
            tt[two.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (oo[i] != 0 && tt[i] == 0) {
                return false;
            }
        }
        return true;
    }
}