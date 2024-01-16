package NKW_HW.HJ36;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) {
            String one = scanner.nextLine();
            String two = scanner.nextLine();
            int temp = 0;
            List<Character> list = new ArrayList<>();
            Set<Character> set = new HashSet<>();
            for (Character cc : one.toCharArray()) {
                if (!set.contains(cc)) {
                    list.add(cc);
                    set.add(cc);
                }
            }
            for (int i = 0; i < 26; i++) {
                char cc = (char) ('a' + i);
                if (!set.contains(cc)) {
                    list.add(cc);
                    set.add(cc);
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (Character cc : two.toCharArray()) {
                stringBuilder.append(list.get(cc - 'a'));
            }
            System.out.println(
                    stringBuilder
            );
        }
    }
}