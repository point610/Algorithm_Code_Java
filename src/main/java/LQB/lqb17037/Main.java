package LQB.lqb17037;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        String ss = scan.nextLine();
        int sum = 0;
        for (char cc : ss.toCharArray()) {
            if ((cc - '0') % 2 == 1) {
                sum++;
            }
        }
        System.out.println(sum);

        scan.close();
    }
}