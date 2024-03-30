package NKW_HW.one.HJ75;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String one = scanner.nextLine();
            String two = scanner.nextLine();
            if (one.length() > two.length()) {
                String temp = two;
                two = one;
                one = temp;
            }
            System.out.println(get(one, two));

        }
    }

    private static int get(String one, String two) {
        int size = one.length();
        for (int i = size; i >= 0; i--) {
            for (int j = 0; j + i <= size; j++) {
                if (two.contains(one.substring(j, j + i))) {
                    return i;
                }
            }
        }
        return 0;
    }
}