package NKW_HW.one.HJ7;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        float v = in.nextFloat();
        System.out.println(Math.round(v));
    }
}