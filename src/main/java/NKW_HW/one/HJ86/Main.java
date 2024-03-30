package NKW_HW.one.HJ86;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String one = Integer.toBinaryString(scanner.nextInt());
        int max = 0;
        int size = one.length();
        int index = 0;
        while (index < size) {
            if (one.charAt(index) != '1') {
                index++;
            } else {
                int next = index;
                while (next < size && one.charAt(next) == '1') {
                    next++;
                }
                max = Math.max(max, next - index);
                index = next;
            }
        }
        System.out.println(max);
    }
}