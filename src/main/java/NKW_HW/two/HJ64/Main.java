package NKW_HW.two.HJ64;

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
        int size = scanner.nextInt();
        scanner.nextLine();
        char[] cc = scanner.nextLine().toCharArray();
        int index = 0;
        if (size <= 4) {
            for (char c : cc) {
                if (c == 'U') {
                    index = (index - 1 + size) % size;
                } else {
                    index = (index + 1) % size;
                }
            }

            for (int i = 1; i <= size; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println(index + 1);

            return;
        }

        int upper = 0;
        int down = 3;

        for (char c : cc) {
            if (c == 'U') {
                if (index == upper) {
                    if (upper == 0) {
                        index = size - 1;
                        down = index;
                        upper = down - 4 + 1;
                    } else {
                        upper--;
                        down--;
                        index--;
                    }
                } else {
                    index--;
                }
            } else {
                if (index == down) {
                    if (down == size - 1) {
                        index = 0;
                        upper = 0;
                        down = upper + 4 - 1;
                    } else {
                        upper++;
                        down++;
                        index++;
                    }
                } else {
                    index++;
                }
            }
        }
        for (int i = upper; i <= down; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        System.out.println(index + 1);
    }

}












