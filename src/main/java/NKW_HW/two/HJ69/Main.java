package NKW_HW.two.HJ69;

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
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] one = new int[a][b];
        int[][] two = new int[b][c];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                one[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < c; j++) {
                two[i][j] = scanner.nextInt();
            }
        }
        int[][] three = new int[a][c];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                int temp = 0;
                for (int k = 0; k < b; k++) {
                    temp += one[i][k] * two[k][j];
                }
                three[i][j] = temp;
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(three[i][j]);
                if (j != c - 1) {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}












