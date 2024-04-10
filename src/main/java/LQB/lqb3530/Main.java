package LQB.lqb3530;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        soluction(scan);
        scan.close();
    }

    private static long res;

    private static void soluction(Scanner scan) {
        int size = scan.nextInt();
        int sum = scan.nextInt();
        res = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(scan.nextInt());
        }
        dfs(list, 0, sum);
        System.out.println(res);

    }

    private static void dfs(List<Integer> list, int index, int left) {
        if (left < 0) {
            return;
        }
        if (index == list.size() || left == 0) {
            res = (res + 1) % 998244353;
            return;
        }
        for (int i = 0; i < left; i++) {
            for (int j = 0; j <= list.get(index); j++) {
                dfs(list, index + 1, left - i * j);
            }
        }
    }

}















