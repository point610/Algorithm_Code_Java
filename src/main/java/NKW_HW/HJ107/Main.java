package NKW_HW.HJ107;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    static double getthreepow(double one) {
        return one * one * one;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double one = scanner.nextDouble();
        boolean sign = false;
        if (one < 0) {
            one = -one;
            sign = true;
        }
        int tempone = 0;
        while (true) {
            if (getthreepow(tempone) <= one && one < getthreepow(tempone + 1)) {
                break;
            }
            tempone++;
        }
        double temptwo = tempone;
        while (true) {
            if (getthreepow(temptwo) <= one && one < getthreepow(temptwo + 0.1)) {
                break;
            }
            temptwo += 0.1;
        }
        double tempthree = temptwo;
        while (true) {
            if (getthreepow(tempthree) <= one && one < getthreepow(tempthree + 0.01)) {
                break;
            }
            tempthree += 0.01;
        }
        double tempfour = tempthree;
        while (true) {
            if (getthreepow(tempfour) <= one && one < getthreepow(tempfour + 0.001)) {
                break;
            }
            tempfour += 0.001;
        }
        if (sign) {
            tempfour = -tempfour;
        }
        System.out.printf("%.1f%n", tempfour);
    }
}