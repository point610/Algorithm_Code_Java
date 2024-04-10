package LQB.lqb17046;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int size = scan.nextInt();
        System.out.println((int) Math.ceil(size / 3.0));
        scan.close();
    }
}