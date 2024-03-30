package NKW_HW.one.HJ97;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int fushu = 0;
        int sum = 0;
        int zhengshu = 0;
        for (int i = 0; i < size; i++) {
            int temp = scanner.nextInt();
            if (temp < 0) {
                fushu++;
            }
            if (temp > 0) {
                zhengshu++;
                sum += temp;
            }
        }
        System.out.print(fushu);
        System.out.print(' ');

        if (zhengshu==0){
            System.out.println("0.0");
        }else {
            System.out.printf("%.1f", (sum * 1.0 / zhengshu));
        }
    }
}