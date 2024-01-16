package NKW_HW.HJ34;

import java.util.Arrays;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] list = scanner.nextLine().toCharArray();
        Arrays.sort(list);
        int size=list.length;
        for (int i = 0; i < size; i++) {
            System.out.print(list[i]);
        }
    }

}