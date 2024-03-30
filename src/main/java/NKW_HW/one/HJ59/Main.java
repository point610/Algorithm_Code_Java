package NKW_HW.one.HJ59;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String one = scanner.nextLine();
            get(one);
        }
    }

    private static void get(String one) {
        int size = one.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            map.put(one.charAt(i), map.getOrDefault(one.charAt(i), 0) + 1);
        }
        for (int i = 0; i < size; i++) {
            if (map.get(one.charAt(i)) == 1) {
                System.out.println(one.charAt(i));
                return;
            }
        }
        System.out.println(-1);
    }
}