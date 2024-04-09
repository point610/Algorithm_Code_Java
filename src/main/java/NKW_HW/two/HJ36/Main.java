package NKW_HW.two.HJ36;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            solution(scanner);
        }
    }

    private static Map<Character, Character> map;

    public static void solution(Scanner scanner) {
        map = new HashMap<>();
        String one = scanner.nextLine();
        initial(one);
        String two = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : two.toCharArray()) {
            if (Character.isLowerCase(c)) {
                stringBuilder.append(map.get(c));
            } else {
                stringBuilder.append(Character.toUpperCase(map.get(Character.toLowerCase(c))));
            }
        }
        System.out.println(stringBuilder);
    }

    private static void initial(String one) {
        Set<Character> set = new HashSet<>();
        StringBuilder A = new StringBuilder("abcdefghijklmnopqrstuvwxyz");

        StringBuilder B = new StringBuilder();
        for (char temp : one.toCharArray()) {
            char cc = Character.toLowerCase(temp);
            if (set.contains(cc)) {

            } else {
                set.add(cc);
                B.append(cc);
            }
        }

        for (int i = 0; i < A.length(); i++) {
            char cc = (char) (i + 'a');
            if (set.contains(cc)) {

            } else {
                B.append(cc);
            }
        }

        for (int i = 0; i < 26; i++) {
            map.put(A.charAt(i), B.charAt(i));
        }

    }
}












