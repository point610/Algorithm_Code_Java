package NKW_HW.one.HJ67;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    private static List<Character> templistsign = new ArrayList<>();

    private static List<Integer> templistnumber = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            templistsign.add('+');
            templistsign.add('-');
            templistsign.add('*');
            templistsign.add('/');
            int one = scanner.nextInt();
            int two = scanner.nextInt();
            int three = scanner.nextInt();
            int four = scanner.nextInt();
            sign = new ArrayList<>();
            number = new ArrayList<>();
            System.out.println(get(one, two, three, four));
        }
    }

    private static List<List<Character>> sign;

    private static List<List<Integer>> number;

    private static void DFSsign(List<Character> tempsign) {
        if (tempsign.size() == 3) {
            sign.add(new ArrayList<>(tempsign));
            return;
        }
        for (int i = 0; i < 4; i++) {
            tempsign.add(templistsign.get(i));
            DFSsign(tempsign);
            tempsign.remove(tempsign.size() - 1);
        }

    }

    private static void DFSnumber(int index) {
        if (index == 3) {
            number.add(new ArrayList<>(templistnumber));
            return;
        }

        for (int i = index; i < 4; i++) {

            int temp = templistnumber.get(i);
            templistnumber.set(i, templistnumber.get(index));
            templistnumber.set(index, temp);


            DFSnumber(index + 1);

            temp = templistnumber.get(i);
            templistnumber.set(i, templistnumber.get(index));
            templistnumber.set(index, temp);
        }

    }

    private static int jisuan(int one, char cc, int two) {
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
                return one + two;
            }
        }
        return 0;
    }

    private static boolean cpu(List<Character> ss, List<Integer> nn) {
        int one = jisuan(nn.get(0), ss.get(0), nn.get(1));
        one = jisuan(one, ss.get(1), nn.get(2));
        one = jisuan(one, ss.get(2), nn.get(3));

        int ttwo = jisuan(nn.get(0), ss.get(0), nn.get(1));
        int tttwo = jisuan(nn.get(2), ss.get(2), nn.get(3));
        int two = jisuan(ttwo, ss.get(1), tttwo);

        int three = jisuan(nn.get(0), ss.get(0), jisuan(nn.get(1), ss.get(1), jisuan(nn.get(2), ss.get(2), nn.get(3))));
        int four = jisuan(nn.get(0), ss.get(0), jisuan(jisuan(nn.get(1), ss.get(1), nn.get(2)), ss.get(2), nn.get(3)));
        int five = jisuan(nn.get(0), ss.get(0), jisuan(nn.get(1), ss.get(1), nn.get(2)));
        five = jisuan(five, ss.get(2), nn.get(3));

        return one == 24 || two == 24 || three == 24 || four
                == 24 || five == 24;

    }

    private static boolean get(int one, int two, int three, int four) {
        DFSsign(new ArrayList<>());
        templistnumber = new ArrayList<>();
        templistnumber.add(one);
        templistnumber.add(two);
        templistnumber.add(three);
        templistnumber.add(four);

        DFSnumber(0);
        for (int i = 0; i < number.size(); i++) {
            for (int j = 0; j < sign.size(); j++) {
                if (cpu(sign.get(j), number.get(i))) {
                    return true;
                }

            }
        }
        return false;

    }
}