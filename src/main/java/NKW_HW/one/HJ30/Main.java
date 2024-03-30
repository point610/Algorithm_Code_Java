package NKW_HW.one.HJ30;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    private static Map<Character, Character> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(Math.pow(2, 50));
        for (int i = 0; i < Math.pow(2, 50); i++) {
        }
        System.out.println(666);
        map.put('0', '0');
        map.put('1', '8');
        map.put('2', '4');
        map.put('3', 'C');
        map.put('4', '2');
        map.put('5', 'A');
        map.put('6', '6');
        map.put('7', 'E');
        map.put('8', '1');
        map.put('9', '9');
        map.put('A', '5');
        map.put('B', 'D');
        map.put('C', '3');
        map.put('D', 'B');
        map.put('E', '7');
        map.put('F', 'F');
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] split = scanner.nextLine().split(" ");
            StringBuilder stringBuilder = new StringBuilder(split[0] + split[1]);
            char[] cc = stringBuilder.toString().toCharArray();
            List<Character> jishu = new ArrayList<>();
            List<Character> oushu = new ArrayList<>();
            for (int i = 0; i < cc.length; i++) {
                if (i % 2 == 0) {
                    oushu.add(cc[i]);
                } else {
                    jishu.add(cc[i]);
                }
            }
            Collections.sort(jishu);
            Collections.sort(oushu);

            for (int i = 0; i < jishu.size(); i++) {
                if (Character.isLowerCase(jishu.get(i)) && map.containsKey(Character.toUpperCase(jishu.get(i)))) {
                    jishu.set(i, Character.toUpperCase(jishu.get(i)));
                }
            }

            for (int i = 0; i < oushu.size(); i++) {
                if (Character.isLowerCase(oushu.get(i)) && map.containsKey(Character.toUpperCase(oushu.get(i)))) {
                    oushu.set(i, Character.toUpperCase(oushu.get(i)));
                }
            }


            for (int i = 0; i < jishu.size(); i++) {
                if (map.containsKey(jishu.get(i))) {
                    jishu.set(i, map.get(jishu.get(i)));
                }
            }
            for (int i = 0; i < oushu.size(); i++) {
                if (map.containsKey(oushu.get(i))) {
                    oushu.set(i, map.get(oushu.get(i)));
                }
            }
            int one = 0;
            int two = 0;
            while (one < oushu.size() && two < jishu.size()) {
                System.out.print(oushu.get(one));
                System.out.print(jishu.get(two));
                one++;
                two++;
            }
            while (one < oushu.size()) {
                System.out.print(oushu.get(one));
                one++;
            }
            while (two < jishu.size()) {
                System.out.print(jishu.get(two));
                two++;
            }
        }


    }

}