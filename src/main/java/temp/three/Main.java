package temp.three;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        char[][] list = new char[size][];
        for (int i = 0; i < size; i++) {
            list[i] = scanner.nextLine().toCharArray();
        }
        System.out.println(0);
        for (int i = 2; i <= size; i++) {
            get(list, i, size);
        }

    }

    private static void get(char[][] list, int offset, int size) {
        int count = 0;
        for (int i = 0; i <= size - offset; i++) {
            for (int j = 0; j <= size - offset; j++) {
                if (same(list, i, j, offset)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static boolean same(char[][] list, int x, int y, int offset) {
        int one = 0;
        int zero = 0;
        for (int i = x; i < x + offset; i++) {
            for (int j = y; j < y + offset; j++) {
                if (list[i][j] == '1') {
                    one++;
                } else {
                    zero++;
                }
            }
        }
        return one == zero;
    }
}