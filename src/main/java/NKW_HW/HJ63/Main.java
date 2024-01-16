package NKW_HW.HJ63;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) {
            String one = scanner.nextLine();
            int size = scanner.nextInt();
            int gcnumber = 0;
            if (size >= one.length()) {
                System.out.println(one);
            } else {

                for (int i = 0; i < size; i++) {
                    if (has(one.charAt(i))) {
                        gcnumber++;
                    }
                }
                int left = 0;
                int right = size;
                int max = gcnumber;
                String smax = one.substring(0, size);
                for (int i = size; i < one.length(); i++) {
                    if (has(one.charAt(left))) {
                        gcnumber--;
                    } else {

                    }
                    left++;
                    if (has(one.charAt(right))) {
                        gcnumber++;
                    } else {

                    }
                    right++;

                    if (gcnumber > max) {
                        max = gcnumber;
                        smax = one.substring(left, right);
                    }


                }
                System.out.println(smax);

            }

        }
    }

    private static boolean has(char c) {
        return c == 'C' || c == 'G';
    }
}