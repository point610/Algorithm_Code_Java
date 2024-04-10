package LQB.lqb17044;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> max = new ArrayList<>();
        List<Integer> min = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(scan.nextInt());
        }
        for (int i = 1; i < size - 1; i++) {
            int left = list.get(i - 1);
            int mid = list.get(i);
            int right = list.get(i + 1);

            if (mid < left && mid < right) {
                min.add(mid);
            }
            if (mid > left && mid > right) {
                max.add(mid);
            }

        }

        Collections.sort(max);
        Collections.sort(min);
        System.out.println(min.get(min.size() - 1) + " " + max.get(0));
        scan.close();
    }
}






