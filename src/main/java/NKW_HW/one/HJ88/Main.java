package NKW_HW.one.HJ88;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    private static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        map.put("3", 1);
        map.put("4", 2);
        map.put("5", 3);
        map.put("6", 4);
        map.put("7", 5);
        map.put("8", 6);
        map.put("9", 7);
        map.put("10", 8);
        map.put("J", 9);
        map.put("Q", 10);
        map.put("K", 11);
        map.put("A", 12);
        map.put("2", 13);
        map.put("joker", 14);
        map.put("JOKER", 15);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] split = scanner.nextLine().split("-");
            get(split[0], split[1]);
        }
    }

    // 个子、对子、顺子（连续5张）、三个、炸弹（四个）和对王中
    private static int getType(String one) {
        String[] split = one.split(" ");
        if (split.length == 1) {
            return 1;
        }
        if (split.length == 3) {
            return 3;
        }
        if (split.length == 4) {
            return 4;
        }

        if (!split[0].equals("joker")) {
            return 2;
        } else {
            return 5;
        }

    }

    private static void get(String one, String two) {

        int onetype = getType(one);
        int twotype = getType(two);

        if (onetype != 4 && onetype != 5 && twotype != 4 && twotype != 5) {
            if (onetype != twotype) {
                System.out.println("ERROR");
                return;
            }
            if (map.get(one.split(" ")[0]) > map.get(two.split(" ")[0])) {
                System.out.println(one);
                return;
            } else {
                System.out.println(two);
                return;
            }
        }

        if (onetype == twotype) {
            if (map.get(one.split(" ")[0]) > map.get(two.split(" ")[0])) {
                System.out.println(one);
                return;
            } else {
                System.out.println(two);
                return;
            }
        }
        if (onetype == 5) {
            System.out.println(one);
        } else if (twotype == 5) {
            System.out.println(two);
        } else if (onetype == 4) {
            System.out.println(one);
        } else {
            System.out.println(two);
        }


    }
}