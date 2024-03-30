package NKW_HW.one.HJ56;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= size; i++) {
            if (getsum(i) == 2 * i) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static int getsum(int one) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= one; i++) {
            if (one % i == 0) {
                list.add(i);
            }
        }
        int sum = 0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sum += list.get(i);
        }
        return sum;
    }
}