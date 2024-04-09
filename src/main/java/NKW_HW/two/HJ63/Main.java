package NKW_HW.two.HJ63;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            solution(scanner);
        }
    }


    public static void solution(Scanner scanner) {
        String one = scanner.nextLine();
        int size = scanner.nextInt();

        int left = 0;
        int right = size;

        int sum = 0;
        for (int i = 0; i < size; i++) {
            char cc = one.charAt(i);
            if (is(cc)) {
                sum++;
            }
        }
        int max = sum;
        int start = 0;

        while (right < one.length()) {

            if (is(one.charAt(right))) {
                sum++;
            }

            if (is(one.charAt(left))) {
                sum--;
            }

            if (sum > max) {
                max = sum;
                start = left + 1;
            }

            left++;
            right++;

        }


        System.out.println(one.substring(start, start + size));
    }

    private static boolean is(char cc) {
        return cc == 'G' || cc == 'C';
    }
}












