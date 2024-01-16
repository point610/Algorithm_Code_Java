package NKW_HW.HJ35;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] list = new int[size][size];
        int index = 1;
        for (int i = 0; i < size; i++) {
            int x = i;
            int y = 0;
            while (x >= 0) {
                list[x][y] = index++;
                x--;
                y++;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (list[i][j] == 0) {
                    break;
                }
                System.out.print(list[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }


    }
}