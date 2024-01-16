package NKW_HW.HJ64;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int size = scanner.nextInt();
            scanner.nextLine();
            String ss = scanner.nextLine();
            get(size, ss);


        }
    }

    private static void get(int size, String ss) {
        if (size <= 4) {
            for (int i = 1; i <= size; i++) {
                System.out.print(i);
                System.out.print(' ');

            }
            System.out.println();
            int index = 0;
            for (char c : ss.toCharArray()) {
                if (c == 'U') {
                    index = (index + size - 1) % size;
                } else {
                    index = (index + size + 1) % size;
                }

            }
            System.out.println(index + 1);
            return;
        }

        int upindex = 0;
        int downindex = 0;
        int index = 0;
        for (char c : ss.toCharArray()) {
            if (c == 'U') {
                index = (index + size - 1) % size;
                if (index == size - 1) {
                    upindex = size - 4;
                } else if (index == upindex - 1) {
                    upindex = index;
                }
                downindex = upindex + 3;

            } else {
                index = (index + size + 1) % size;
                if (index == 0) {
                    downindex = index + 3;
                } else if (index == downindex + 1) {
                    downindex = index;
                }

                upindex = downindex - 3;
            }

        }
        for (int i = upindex; i <= downindex; i++) {
            System.out.print(i + 1);
            System.out.print(' ');
        }
        System.out.println();
        System.out.println(index + 1);
    }
}