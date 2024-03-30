package NKW_HW.one.HJ21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Character> map = new HashMap<>();
        map.put('a', '2');
        map.put('b', '2');
        map.put('c', '2');
        map.put('d', '3');
        map.put('e', '3');
        map.put('f', '3');
        map.put('g', '4');
        map.put('h', '4');
        map.put('i', '4');
        map.put('j', '5');
        map.put('k', '5');
        map.put('l', '5');
        map.put('m', '6');
        map.put('n', '6');
        map.put('o', '6');

        map.put('p', '7');
        map.put('q', '7');
        map.put('r', '7');
        map.put('s', '7');
        map.put('t', '8');
        map.put('u', '8');
        map.put('v', '8');
        map.put('w', '9');
        map.put('x', '9');
        map.put('y', '9');
        map.put('z', '9');
        String ss = scanner.nextLine();
        int size = ss.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            char cc = ss.charAt(i);
            if (map.containsKey(cc)) {
                stringBuilder.append(map.get(cc));
            } else if ('A' <= cc && cc <= 'Z') {
                stringBuilder.append((char)((cc - 'A' + 1) % 26 + 'a'));
            } else {
                stringBuilder.append(cc);
            }
        }
        System.out.println(stringBuilder);
    }
}