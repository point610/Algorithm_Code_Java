package NKW_HW.two.HJ30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
        StringBuilder temp = new StringBuilder(scanner.nextLine().replace(" ", ""));
        List<Character> oo = new ArrayList<>();
        List<Character> tt = new ArrayList<>();
        int size = temp.length();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                oo.add(temp.charAt(i));
            } else {
                tt.add(temp.charAt(i));
            }
        }
        Collections.sort(oo);
        Collections.sort(tt);
        temp = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                temp.append(oo.get(i / 2));
            } else {
                temp.append(tt.get(i / 2));

            }
        }
        //System.out.println(temp);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < size; i++) {
            res.append(change(temp.charAt(i)));
        }
        System.out.println(res);

    }

    private static char change(char cc) {
        StringBuilder stringBuilder = new StringBuilder();
        if (Character.isLowerCase(cc) && cc <= 'f') {
            int temp = 10 + (cc - 'a');
            stringBuilder = new StringBuilder(Integer.toBinaryString(temp));
            while (stringBuilder.length() < 4) {
                stringBuilder.insert(0, '0');
            }
        } else if (Character.isUpperCase(cc) && cc <= 'F') {
            int temp = 10 + (cc - 'A');
            stringBuilder = new StringBuilder(Integer.toBinaryString(temp));
            while (stringBuilder.length() < 4) {
                stringBuilder.insert(0, '0');
            }
        } else if (Character.isDigit(cc)) {
            int temp = (cc - '0');
            stringBuilder = new StringBuilder(Integer.toBinaryString(temp));
            while (stringBuilder.length() < 4) {
                stringBuilder.insert(0, '0');
            }
        } else {
            return cc;
        }
        int ii = Integer.parseInt(stringBuilder.reverse().toString(), 2);
        if (ii < 10) {
            return (char) (ii + '0');
        }
        return (char) (ii - 10 + 'A');
    }
}












