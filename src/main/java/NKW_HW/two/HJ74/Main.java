package NKW_HW.two.HJ74;

import java.util.ArrayList;
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
        String ss = scanner.nextLine() + ' ';
        List<String> list = new ArrayList<>();

        int number = 0;

        List<Integer> space = new ArrayList<>();
        for (int i = 0; i < ss.length(); i++) {
            char cc = ss.charAt(i);
            if (cc == '"') {
                number++;
                continue;
            }
            if (cc == ' ') {
                if (number % 2 == 1) {

                } else {
                    space.add(i);
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        for (int i = 0; i < ss.length(); i++) {
            char cc = ss.charAt(i);
            if (i == space.get(index)) {
                if (stringBuilder.charAt(0) == '"') {
                    list.add(new String(stringBuilder.substring(1, stringBuilder.length() - 1)));
                } else {
                    list.add(new String(stringBuilder));
                }
                stringBuilder = new StringBuilder();
                index++;
                continue;
            }

            stringBuilder.append(cc);
        }

        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}












