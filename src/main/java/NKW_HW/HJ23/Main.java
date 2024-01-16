package NKW_HW.HJ23;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[26];
        String ss = scanner.nextLine();
        int size = ss.length();
        for (int i = 0; i < size; i++) {
            list[ss.charAt(i) - 'a']++;
        }
        int minindex = 0;
        for (int i = 0; i < 26; i++) {
            if (list[i] != 0) {
                minindex = i;
                break;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (list[i] != 0 && list[i] < list[minindex]) {
                minindex = i;
            }
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < 26; i++) {
            if (list[i] == list[minindex]) {
                set.add((char) ('a' + i));
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (set.contains(ss.charAt(i))) {

            } else {
                stringBuilder.append(ss.charAt(i));
            }
        }
        System.out.println(stringBuilder);
    }
}