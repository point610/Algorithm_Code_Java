package NKW_HW.one.HJ58;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int K = scanner.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list);
        for (int i = 0; i < K; i++) {
            System.out.print(list.get(i));
            System.out.print(" ");
        }
    }
}