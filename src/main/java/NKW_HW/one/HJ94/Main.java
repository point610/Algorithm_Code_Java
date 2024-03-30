package NKW_HW.one.HJ94;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        scanner.nextLine();
        String[] one = scanner.nextLine().split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            map.put(one[i], 0);
        }

        size = scanner.nextInt();
        scanner.nextLine();
        int Invalid = 0;
        String[] two = scanner.nextLine().split(" ");
        for (int i = 0; i < size; i++) {
            if (map.containsKey(two[i])) {
                map.put(two[i], map.get(two[i]) + 1);
            } else {
                Invalid++;
            }
        }
        size = one.length;
        for (int i = 0; i < size; i++) {
            System.out.println(one[i] + " : " + map.get(one[i]));
        }
        System.out.println("Invalid : " + Invalid);

    }
}