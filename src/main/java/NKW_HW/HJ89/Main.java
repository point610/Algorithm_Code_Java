package NKW_HW.HJ89;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    private static Map<String, Integer> map = new HashMap<>();

    private static Map<Integer, String> num2map = new HashMap<>();

    private static List<Character> sign = new ArrayList<>();

    private static List<Integer> number = new ArrayList<>();

    private static List<List<Character>> signlist = new ArrayList<>();

    private static List<List<Integer>> numberlist = new ArrayList<>();

    private static void getsignlist(List<Character> temp) {
        if (temp.size() == 3) {
            signlist.add(new ArrayList<>(temp));
            return;
        }
        for (Character cc : sign) {
            temp.add(cc);
            getsignlist(temp);
            temp.remove(temp.size() - 1);
        }
    }

    private static void getnumberlist(int index) {
        if (index == 3) {
            numberlist.add(new ArrayList<>(number));
            return;
        }

        for (int i = index; i < 4; i++) {

            int temp = number.get(i);
            number.set(i, number.get(index));
            number.set(index, temp);

            getnumberlist(index + 1);

            temp = number.get(i);
            number.set(i, number.get(index));
            number.set(index, temp);
        }
    }

    public static void main(String[] args) {
        sign.add('+');
        sign.add('-');
        sign.add('*');
        sign.add('/');
        getsignlist(new ArrayList<>());

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String ss = scanner.nextLine();
            if (ss.contains("joker") || ss.contains("JOKER")) {
                System.out.println("ERROR");
                continue;
            }
            sign = new ArrayList<>();

            String[] split = ss.split(" ");
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

            num2map.put(1, "A");
            num2map.put(2, "2");
            num2map.put(3, "3");
            num2map.put(4, "4");
            num2map.put(5, "5");
            num2map.put(6, "6");
            num2map.put(7, "7");
            num2map.put(8, "8");
            num2map.put(9, "9");
            num2map.put(10, "10");
            num2map.put(11, "J");
            num2map.put(12, "Q");
            num2map.put(13, "K");
            number = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                number.add(map.get(split[i]));
            }
            getnumberlist(0);

            System.out.println(jisuan());
        }
    }

    private static int ji(Integer one, Character cc, Integer two) {
        switch (cc) {
            case '+': {
                return one + two;
            }
            case '-': {
                return one - two;
            }
            case '*': {
                return one * two;
            }
            case '/': {
                if (two == 0) {
                    return 0;
                }
                return one / two;
            }
        }
        return 0;
    }

    private static String jisuan() {

        for (List<Integer> nn : numberlist) {
            for (List<Character> cc : signlist) {
                if (24 == (ji(ji(ji(nn.get(0), cc.get(0), nn.get(1)), cc.get(1), nn.get(2)), cc.get(2), nn.get(3)))) {
                    return num2map.get(nn.get(0))
                            + cc.get(0)
                            + num2map.get(nn.get(1))
                            + cc.get(1)
                            + num2map.get(nn.get(2))
                            + cc.get(2)
                            + num2map.get(nn.get(3));
                }

            }
        }
        return "NONE";

    }
}