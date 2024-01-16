package NKW_HW.HJ69;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int one1 = scanner.nextInt();
            int one2 = scanner.nextInt();
            int two1 = one2;
            int two2 = scanner.nextInt();
            int[][] one = new int[one1][one2];
            int[][] two = new int[two1][two2];
            for (int i = 0; i < one1; i++) {
                for (int j = 0; j < one2; j++) {
                    one[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < two1; i++) {
                for (int j = 0; j < two2; j++) {
                    two[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < one1; i++) {

                for (int j = 0; j < two2; j++) {
                    int sum = 0;
                    for (int k = 0; k < two1; k++) {
                        sum += one[i][k] * two[k][j];
                    }
                    System.out.print(sum);
                    System.out.print(' ');
                }
                System.out.println();

            }
        }
    }
}