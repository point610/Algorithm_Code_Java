package LQB.lqb3519;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        char[] cc = scan.nextLine().toCharArray();
        scan.close();

        int sum = 0;
        for (int i = 0; i < cc.length - 1; i++) {
            if (cc[i] == cc[i + 1] || cc[i] == '?' || cc[i + 1] == '?') {
                sum++;
                i++;
            }
        }
        System.out.println(sum);

    }
}