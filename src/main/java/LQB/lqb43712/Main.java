package LQB.lqb43712;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int size = scan.nextInt();
        int count = 0;
        for (int i = 1; i <= size; i++) {
            if (is(i)) {
                count++;
            }
        }

        System.out.println(count);
        scan.close();
    }

    private static boolean is(int one) {
        int temp = one % 10;
        while (one != 0) {
            if (temp < one % 10) {
                return false;
            }
            temp = one % 10;
            one /= 10;
        }
        return true;
    }
}