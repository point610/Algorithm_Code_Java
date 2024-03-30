package NKW_HW.two.HJ35;

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
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];
        int index = 1;

        int x = 0;
        int y = 0;
        for (int i = 0; i < size; i++) {
            x = i;
            y = 0;
            for (int j = 0; j <= i; j++) {
                arr[x][y] = index++;
                x--;
                y++;
            }

        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}












