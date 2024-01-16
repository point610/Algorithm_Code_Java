package NKW_HW.HJ93;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    private static boolean sign = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int size = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            int five = 0;
            int three = 0;
            int sum = 0;
            for (int i = 0; i < size; i++) {
                int temp = scanner.nextInt();
                if (temp % 5 == 0) {
                    five += temp;
                } else if (temp % 3 == 0) {
                    three += temp;
                } else {
                    list.add(temp);
                }
                sum += temp;
            }

            if (sum % 2 != 0) {
                System.out.println("false");
            } else {
                int target = sum / 2 - five;
                DFS(target, list, 0, 0);
                System.out.println(sign);
            }
        }
    }

    private static void DFS(int target, List<Integer> list, int sum, int index) {
        if (sum == target) {
            sign = true;
            return;
        }
        if (index == list.size()) {
            return;
        }
        DFS(target, list, sum, index + 1);
        DFS(target, list, sum + list.get(index), index + 1);

    }


}