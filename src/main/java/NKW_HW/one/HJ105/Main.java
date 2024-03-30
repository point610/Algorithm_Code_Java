package NKW_HW.one.HJ105;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            list.add(scanner.nextInt());
        }

        int fushu = 0;
        long sum = 0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) < 0) {
                fushu++;
            } else {
                sum = sum + list.get(i);
            }
        }
        System.out.println(fushu);
        if (size - fushu == 0) {
            System.out.println("0.0");
        } else {
            System.out.printf("%.1f", (sum * 1.0 / (size - fushu)));
        }
    }
}