package NKW_HW.one.HJ44;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int[][] list = new int[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    list[i][j] = scanner.nextInt();
                }
            }
            shudu(list);
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(list[i][j]);
                    System.out.print(' ');
                }
                System.out.println();
            }
        }
    }

    private static boolean shudu(int[][] list) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (list[i][j] != 0) {
                    continue;
                }
                for (int k = 1; k <= 9; k++) {

                    if (isvalid(i, j, k, list)) {
                        // k为有效之后才设置，在IsValid之前为0
                        list[i][j] = k;
                        if (shudu(list)) {
                            return true;
                        }
                        list[i][j] = 0;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private static boolean isvalid(int row, int col, int value, int[][] list) {

        for (int i = 0; i < 9; i++) {
            if (list[row][i] == value) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (list[i][col] == value) {
                return false;
            }
        }
        int startx = row / 3 * 3;
        int starty = col / 3 * 3;

        for (int i = startx; i < startx + 3; i++) {
            for (int j = starty; j < starty + 3; j++) {
                if (list[i][j] == value) {
                    return false;
                }
            }
        }
        return true;
    }
}