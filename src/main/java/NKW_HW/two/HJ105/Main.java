package NKW_HW.two.HJ105;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int fushu = 0;
        int size = 0;
        int sum = 0;
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            size++;
            int temp = scanner.nextInt();

            if (temp < 0) {
                fushu++;
            } else {
                sum += temp;
            }
        }
        System.out.println(fushu);
        if (fushu == size) {
            System.out.println("0.0");
        }else {
            System.out.printf("%.1f",(double)sum / (size - fushu));
        }
    }

}












