package NKW_HW.two.HJ65;

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
        String one = scanner.nextLine();
        String two = scanner.nextLine();
        if (one.length() > two.length()) {
            String temp = one;
            one = two;
            two = temp;
        }

        int size = one.length();
        for (int i = size - 1; i >= 1; i--) {

            for (int j = 0; j + i < size; j++) {
                if (two.contains(one.substring(j, j + i + 1))) {
                    System.out.println(one.substring(j, j + i + 1));
                    return;
                }
            }
        }
        System.out.println();
    }

}












