package temp.wz.one;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    private static int[][] list;

    public static void main(String[] args) {
        list = new int[3][3];
        int index = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list[i][j] = index++;
            }
        }
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            solution(scanner);
        }
    }

    public static void solution(Scanner scanner) {

        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            int temp = scanner.nextInt();
            if (temp <= 3) {
                moverow(temp - 1);
            } else {
                movecol(temp - 4);
            }
        }
        print();
    }

    private static void moverow(int row) {
        int temp = list[row][2];
        for (int i = 2; i >=1; i--) {
            list[row][i] = list[row][i - 1];
        }
        list[row][0] = temp;
    }

    private static void movecol(int col) {
        int temp = list[0][col];
        for (int i = 0; i < 2; i++) {
            list[i][col] = list[i + 1][col];
        }
        list[2][col] = temp;
    }

    private static void print() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
    }
}












