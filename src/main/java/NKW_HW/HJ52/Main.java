package NKW_HW.HJ52;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            String one = scanner.nextLine();
            String two = scanner.nextLine();
            System.out.println(get(one, two));

        }
    }

    private static int get(String one, String two) {
        int onesize = one.length();
        int twosize = two.length();

        int[][] list = new int[onesize + 1][twosize + 1];
        for (int i = 0; i < onesize + 1; i++) {
            list[i][0] = i;
        }

        for (int i = 0; i < twosize + 1; i++) {
            list[0][i] = i;
        }
        for (int i = 1; i < onesize + 1; i++) {
            for (int j = 1; j < twosize + 1; j++) {
                if (one.charAt(i - 1) == two.charAt(j - 1)) {
                    list[i][j] = list[i - 1][j - 1];
                } else {
                    list[i][j] = Math.min(list[i - 1][j - 1], Math.min(list[i - 1][j], list[i][j - 1])) + 1;
                }
            }
        }
        return list[onesize][twosize];
    }
}