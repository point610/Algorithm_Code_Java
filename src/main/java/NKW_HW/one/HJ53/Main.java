package NKW_HW.one.HJ53;


import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        if (row <= 2) {
            System.out.println(-1);
            return;
        }
        int[][] list = new int[row][2 * row - 1];
        list[0][0] = 1;
        list[1][0] = 1;
        list[1][1] = 1;
        list[1][2] = 1;

        for (int i = 2; i < row; i++) {
            list[i][0] = 1;
            list[i][i * 2] = 1;
            list[i][1] = list[i - 1][0] + list[i - 1][1];
            list[i][i * 2 - 1] = list[i][1];
        }
        for (int i = 2; i < row; i++) {
            int last = i * 2;
            for (int j = 2; j < last - 1; j++) {
                list[i][j] = list[i - 1][j] + list[i - 1][j - 1] + list[i - 1][j - 2];
            }
        }

        // for (int i = 0; i < row; i++) {
        //     System.out.println(Arrays.toString(list[i]));
        // }

        for (int i = 0; i < 2 * row - 1; i++) {
            if (list[row - 1][i] % 2 == 0) {
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(-1);

    }
}