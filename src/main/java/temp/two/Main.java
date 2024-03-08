package temp.two;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        String one = scanner.nextLine();
        String two = scanner.nextLine();
        Map<Character, Set<Character>> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            char oo = one.charAt(i);
            char tt = two.charAt(i);
            if (!map.containsKey(oo)) {
                map.put(oo, new HashSet<>());
            }
            if (!map.containsKey(tt)) {
                map.put(tt, new HashSet<>());
            }
        }
        int count = 0;
        int change = 0;
        Set<Character> set = new HashSet<>();
        boolean canupper = false;
        for (int i = 0; i < size; i++) {
            char oo = one.charAt(i);
            char tt = two.charAt(i);
            if (oo == tt) {
                count++;
            } else {
                if (set.contains(oo)) {
                    canupper = true;
                } else {
                    set.add(tt);
                }
                if (map.get(tt).contains(oo)) {
                    change = 2;
                }
                map.get(oo).add(tt);
            }
        }
        if (change == 0 && canupper) {
            System.out.println(count + change + 1);
        } else {
            System.out.println(count + change);
        }
    }
}