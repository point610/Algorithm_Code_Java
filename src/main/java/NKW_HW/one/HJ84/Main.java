package NKW_HW.one.HJ84;


import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ss = scanner.nextLine();
        int size = ss.length();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (Character.isUpperCase(ss.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
    }
}