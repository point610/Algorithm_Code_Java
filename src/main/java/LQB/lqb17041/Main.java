package LQB.lqb17041;

import java.util.ArrayList;
import java.util.Collections;
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

    private static void soluction(Scanner scan) {
        int size = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(scan.nextInt());
        }
        Collections.sort(list);
        int[] dp = new int[size + 1];
        dp[0] = 1;
        for (int i = 1; i < size + 1; i++) {
            for (Integer integer : list) {
                if (i - integer < 0) {
                    break;
                }
                dp[i] = (dp[i - integer]) % 1000000007;
            }
        }
        System.out.println(dp[size]);
    }
}

















