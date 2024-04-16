package NKW_HW.two.HJ88;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    private static Map<String, Integer> map;

    public static void main(String[] args) {
        map = new HashMap<>();
        initial();
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            solution(scanner);
        }
    }

    private static void initial() {
        map.put("3", 3);
        map.put("4", 4);
        map.put("5", 5);
        map.put("6", 6);
        map.put("7", 7);
        map.put("8", 8);
        map.put("9", 9);
        map.put("10", 10);
        map.put("J", 11);
        map.put("Q", 12);
        map.put("K", 13);
        map.put("A", 14);
        map.put("2", 15);
        map.put("joker", 16);
        map.put("JOKER", 17);
    }

    public static void solution(Scanner scanner) {
        String[] split = scanner.nextLine().split("-");
        String one = split[0];
        String two = split[1];

        if (JOKER(one, two)) {
            System.out.println("joker JOKER");
            return;
        }
        // 炸弹
        int temp = zhadan(one, two);
        if (temp != 0) {
            if (temp == 1) {
                System.out.println(one);
            } else {
                System.out.println(two);
            }
            return;
        }
        // 三个
        temp = sange(one, two);
        if (temp != 0) {
            if (temp == 1) {
                System.out.println(one);
            } else {
                System.out.println(two);
            }
            return;
        }
        // 对子
        temp = duizi(one, two);
        if (temp != 0) {
            if (temp == 1) {
                System.out.println(one);
            } else {
                System.out.println(two);
            }
            return;
        }
        // 顺子
        temp = shunzi(one, two);
        if (temp != 0) {
            if (temp == 1) {
                System.out.println(one);
            } else {
                System.out.println(two);
            }
            return;
        }

        temp = gezi(one, two);
        if (temp != 0) {
            if (temp == 1) {
                System.out.println(one);
            } else {
                System.out.println(two);
            }
            return;
        }

        System.out.println("ERROR");


    }

    private static boolean JOKER(String one, String two) {
        return one.equals("joker JOKER") || two.equals("joker JOKER");
    }

    private static int zhadan(String one, String two) {
        boolean oneis = iszhadan(one);
        boolean twois = iszhadan(two);
        if (oneis && twois) {
            if (map.get(one.split(" ")[0]) - (map.get(two.split(" ")[0])) > 0) {
                return 1;
            } else {
                return 2;
            }
        }
        if (oneis) {
            return 1;
        }
        if (twois) {
            return 2;
        }
        return 0;
    }

    private static int sange(String one, String two) {
        boolean oneis = issange(one);
        boolean twois = issange(two);
        if (oneis && twois) {
            if (map.get(one.split(" ")[0]) - (map.get(two.split(" ")[0])) > 0) {
                return 1;
            } else {
                return 2;
            }
        }
        return 0;
    }

    private static int duizi(String one, String two) {
        boolean oneis = isduizi(one);
        boolean twois = isduizi(two);
        if (oneis && twois) {
            if (map.get(one.split(" ")[0]) - (map.get(two.split(" ")[0])) > 0) {
                return 1;
            } else {
                return 2;
            }
        }
        return 0;
    }

    private static int shunzi(String one, String two) {
        boolean oneis = isshunzi(one);
        boolean twois = isshunzi(two);
        if (oneis && twois) {
            if (map.get(one.split(" ")[0]) - (map.get(two.split(" ")[0])) > 0) {
                return 1;
            } else {
                return 2;
            }
        }
        return 0;
    }

    private static int gezi(String one, String two) {
        boolean oneis = isgezi(one);
        boolean twois = isgezi(two);
        if (oneis && twois) {
            if (map.get(one.split(" ")[0]) - (map.get(two.split(" ")[0])) > 0) {
                return 1;
            } else {
                return 2;
            }
        }
        return 0;
    }

    private static boolean iszhadan(String one) {
        String[] split = one.split(" ");
        if (split.length != 4) {
            return false;
        }
        for (int i = 0; i < split.length; i++) {
            if (!split[0].equals(split[i])) {
                return false;
            }
        }
        return true;
    }

    private static boolean issange(String one) {
        String[] split = one.split(" ");
        if (split.length != 3) {
            return false;
        }
        for (int i = 0; i < split.length; i++) {
            if (!split[0].equals(split[i])) {
                return false;
            }
        }
        return true;
    }

    private static boolean isduizi(String one) {
        String[] split = one.split(" ");
        if (split.length != 2) {
            return false;
        }
        for (int i = 0; i < split.length; i++) {
            if (!split[0].equals(split[i])) {
                return false;
            }
        }
        return true;
    }

    private static boolean isshunzi(String one) {
        String[] split = one.split(" ");
        if (split.length != 5) {
            return false;
        }
        for (int i = 0; i < split.length; i++) {
            if (map.get(split[0]) + 1 != map.get(split[1])) {
                return false;
            }
        }
        return true;
    }

    private static boolean isgezi(String one) {
        String[] split = one.split(" ");
        if (split.length != 1) {
            return false;
        }
        return true;
    }

}












