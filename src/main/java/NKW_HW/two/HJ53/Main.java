package NKW_HW.two.HJ53;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int num = in.nextInt();
            if (num == 1 || num == 2) {
                System.out.println(-1);
                continue;
            } else if (num % 4 == 1 || num % 4 == 3) {
                System.out.println(2);
            } else if (num % 4 == 0) {
                System.out.println(3);
            } else if (num % 4 == 2) {
                System.out.println(4);
            }
        }
    }
}











