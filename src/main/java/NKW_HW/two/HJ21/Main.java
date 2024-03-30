package NKW_HW.two.HJ21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
        Map<Character, Integer> map = getmap();
        String ss = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        for (char cc : ss.toCharArray()) {
            if (Character.isUpperCase(cc)) {
                stringBuilder.append(getcc(cc));
            } else if (Character.isLowerCase(cc)) {
                stringBuilder.append(map.get(cc));
            } else {
                stringBuilder.append(cc);
            }
        }


        System.out.println(stringBuilder);
    }

    public static char getcc(char cc) {
        cc = Character.toLowerCase(cc);
        cc = (char) ('a' + (cc - 'a' + 1) % 26);
        return cc;
    }

    public static Map<Character, Integer> getmap() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 2);
        map.put('b', 2);
        map.put('c', 2);

        map.put('d', 3);
        map.put('e', 3);
        map.put('f', 3);

        map.put('g', 4);
        map.put('h', 4);
        map.put('i', 4);

        map.put('l', 5);
        map.put('j', 5);
        map.put('k', 5);

        map.put('m', 6);
        map.put('n', 6);
        map.put('o', 6);

        map.put('p', 7);
        map.put('q', 7);
        map.put('r', 7);
        map.put('s', 7);

        map.put('t', 8);
        map.put('u', 8);
        map.put('v', 8);

        map.put('w', 9);
        map.put('x', 9);
        map.put('y', 9);
        map.put('z', 9);

        return map;
    }
}












