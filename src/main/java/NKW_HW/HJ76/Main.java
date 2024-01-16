package NKW_HW.HJ76;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        int pow = number * number * number;
        if (number % 2 == 0) {
            int mid = pow / number;
            int left = mid + 1 - (number / 2) * 2;
            int right = mid - 1 + (number / 2) * 2;
            for (int i = left; i <= right; i += 2) {
                list.add(i);
            }

        } else {
            int mid = pow / number;
            int left = mid - (number / 2) * 2;
            int right = mid + (number / 2) * 2;
            for (int i = left; i <= right; i += 2) {
                list.add(i);
            }
        }

        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            System.out.print(list.get(i));
            System.out.print('+');
        }
        System.out.println(list.get(size - 1));

    }

}