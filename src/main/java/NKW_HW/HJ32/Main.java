package NKW_HW.HJ32;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            String ss = scanner.nextLine();
            System.out.println(findmax(ss.toCharArray()));

        }
    }

    private static int findmax(char[] one) {
        int size = one.length;

        int[] dan = new int[size];
        for (int i = 1; i < size - 1; i++) {
            int left = i;
            int right = i;
            while (left >= 0 && right < size) {
                if (one[left] != one[right]) {
                    break;
                }
                left--;
                right++;
            }
            dan[i] = right - left - 1;
        }


        int[] shuan = new int[size];
        for (int i = 0; i < size - 1; i++) {
            if (one[i] != one[i + 1]) {
                continue;
            }

            int left = i;
            int right = i + 1;
            while (left >= 0 && right < size) {
                if (one[left] != one[right]) {
                    break;
                }
                left--;
                right++;
            }
            shuan[i] = right - left - 1;
        }

        int max = 0;
        for (int i = 0; i < size; i++) {
            max = Math.max(dan[i], max);
            max = Math.max(shuan[i], max);
        }
        return max;
    }
}