package NKW_HW.one.HJ37;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        if (size == 1 || size == 2) {
            System.out.println(1);
            return;
        }
        int[] list = new int[size];
        list[0] = 1;
        list[1] = 1;
        for (int i = 2; i < size; i++) {
            list[i] = list[i - 1] + list[i - 2];
        }
        System.out.println(list[size - 1]);
    }
}