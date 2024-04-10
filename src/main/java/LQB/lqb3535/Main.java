package LQB.lqb3535;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int size = scan.nextInt();
        for (int i = 0; i < size; i++) {
            soluction(scan);
        }
        scan.close();
    }

    private static void soluction(Scanner scanner) {
        int N = scanner.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        int res = 0;
        for (int j = 0; j < N; ++j) {
            int e = scanner.nextInt();

            if (e % 2 == 0) {
                ++evenCount;
            } else {
                ++oddCount;
            }
        }

        if (oddCount % 2 == 0) {
            res = (int) (Math.pow(2, evenCount) * Math.pow(2, oddCount == 0 ? 0 : oddCount - 1) % 1000000007);
        }

        System.out.println(res);
    }
}













