package LQB.lqb43719;

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
        while (one != 0) {
            if (one % 10 == 2) {
                return false;
            }
            one /= 10;
        }
        return true;
    }
}

