package NKW_HW.HJ9;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int size = s.length();
        Set<Character> set = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = size - 1; i >= 0; i--) {
            if (set.contains(s.charAt(i))) {

            } else {
                stringBuilder.append(s.charAt(i));
                set.add(s.charAt(i));
            }

        }
        System.out.println(stringBuilder);
    }
}