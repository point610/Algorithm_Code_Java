package NKW_HW.two.HJ91;

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
        int row = scanner.nextInt() + 1;
        int col = scanner.nextInt() + 1;
        int[][] list = new int[row][col];
        list[0][0] = 1;
        for (int i = 0; i < row; i++) {
            list[i][0] = 1;
        }
        for (int i = 0; i < col; i++) {
            list[0][i] = 1;
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                list[i][j] = list[i - 1][j] + list[i][j - 1];
            }
        }
        System.out.println(list[row - 1][col - 1]);

    }
}



















