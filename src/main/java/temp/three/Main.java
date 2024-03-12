package temp.three;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        int[][] list = new int[size + 1][size + 1];
        for (int i = 0; i < size; i++) {
            char[] charArray = scanner.nextLine().toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                int temp = charArray[j] - '0';
                list[i + 1][j + 1] = temp + list[i][j + 1] + list[i + 1][j] - list[i][j];
            }
        }

        System.out.println(0);
        for (int i = 2; i <= size; i++) {
            get(list, i, size);
        }
    }

    private static void get(int[][] list, int offset, int size) {
        int target = offset * offset;
        if (target % 2 != 0) {
            System.out.println(0);
            return;
        }
        int count = 0;
        target = target / 2;
        for (int i = 0; i <= size - offset; i++) {
            for (int j = 0; j <= size - offset; j++) {
                int tempsum = list[i + offset][j + offset] - list[i + offset][j] - list[i][j + offset] + list[i][j];
                if (tempsum == target) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}