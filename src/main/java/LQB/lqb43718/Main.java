package LQB.lqb43718;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    private static int a;
    private static int b;
    private static int c;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int size = scan.nextInt();
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        int count = 0;
        for (int i = 1; i <= size; i++) {
            if (!is(i)) {
                count++;
            }
        }

        System.out.println(count);
        scan.close();
    }

    private static boolean is(int one) {

        return one % a == 0 || one % c == 0 || one % b == 0;
    }
}
