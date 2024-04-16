package NKW_HW.two.HJ89;

import com.sun.xml.internal.ws.policy.subject.WsdlBindingSubject;

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

    private static Map<String, Integer> map;
    private static Map<Integer, String> nomap;
    private static List<Integer> number;
    private static List<List<Integer>> numberlist;
    private static List<Character> sign;
    private static List<List<Character>> signlist;
    private static boolean find;
    private static StringBuilder stringBuilder;

    public static void solution(Scanner scanner) {
        find = false;
        stringBuilder = new StringBuilder();
        initial();
        String[] split = scanner.nextLine().split(" ");
        if (!check(split)) {
            System.out.println("ERROR");
            return;
        }
        number = new ArrayList<>();
        for (String ss : split) {
            number.add(map.get(ss));
        }
        initiallistandsign();
        cal();
        if (find) {
            System.out.println(stringBuilder);
        } else {
            System.out.println("NONE");
        }
    }

    private static void cal() {
        for (List<Integer> oo : numberlist) {
            for (List<Character> tt : signlist) {
                cal(oo, tt);
                if (find) {
                    stringBuilder = getstr(oo, tt);
                    return;
                }
            }
        }
    }

    private static StringBuilder getstr(List<Integer> one, List<Character> two) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(nomap.get(one.get(0)));
        for (int i = 0; i < 3; i++) {
            stringBuilder.append(two.get(i)).append(nomap.get(one.get(i + 1)));
        }
        return stringBuilder;
    }

    private static void cal(List<Integer> one, List<Character> two) {
        int res = one.get(0);
        for (int i = 0; i < 3; i++) {
            int oo = res;
            int tt = one.get(i + 1);
            switch (two.get(i)) {
                case '+': {
                    res = oo + tt;
                    break;
                }
                case '-': {
                    res = oo - tt;
                    break;
                }
                case '*': {
                    res = oo * tt;
                    break;
                }
                case '/': {
                    if (tt == 0) {
                        return;
                    }
                    res = oo / tt;
                    break;
                }
            }
        }
        if (res == 24) {
            find = true;
        }
    }


    private static void initiallistandsign() {
        numberlist = new ArrayList<>();
        sign = new ArrayList<>();
        signlist = new ArrayList<>();
        sign.add('+');
        sign.add('-');
        sign.add('*');
        sign.add('/');

        dfsnumber(0);
        dfssign(new ArrayList<>());
    }

    private static void dfssign(List<Character> temp) {
        if (temp.size() == 3) {
            signlist.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < sign.size(); i++) {
            temp.add(sign.get(i));

            dfssign(temp);

            temp.remove(temp.size() - 1);
        }
    }

    private static void dfsnumber(int index) {
        if (index == number.size()) {
            numberlist.add(new ArrayList<>(number));
            return;
        }
        for (int i = index; i < number.size(); i++) {
            int temp = number.get(i);
            number.set(i, number.get(index));
            number.set(index, temp);

            dfsnumber(index + 1);

            temp = number.get(i);
            number.set(i, number.get(index));
            number.set(index, temp);
        }
    }

    private static boolean check(String[] one) {
        for (String ss : one) {
            if (ss.equals("joker") || ss.equals("JOKER")) {
                return false;
            }
        }
        return true;
    }

    private static void initial() {
        map = new HashMap<>();
        map.put("A", 1);
        map.put("2", 2);
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

        nomap = new HashMap<>();
        nomap.put(1, "A");
        nomap.put(2, "2");
        nomap.put(3, "3");
        nomap.put(4, "4");
        nomap.put(5, "5");
        nomap.put(6, "6");
        nomap.put(7, "7");
        nomap.put(8, "8");
        nomap.put(9, "9");
        nomap.put(10, "10");
        nomap.put(11, "J");
        nomap.put(12, "Q");
        nomap.put(13, "K");
    }
}












