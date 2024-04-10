package LQB.lqb17047;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        String ss = scan.nextLine();
        int L = 0;
        int R = 0;
        int sum = 0;

        for (char cc : ss.toCharArray()) {
            if (cc == 'L') {
                L++;
            } else {
                R++;
            }
            if (L == R) {
                sum++;
            }
        }

        System.out.println(sum);
        scan.close();
    }
}