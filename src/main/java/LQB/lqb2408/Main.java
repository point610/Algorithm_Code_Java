package LQB.lqb2408;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int sum = 0;
        LocalDate from = LocalDate.of(1900, 1, 1);
        LocalDate to = LocalDate.of(9999, 12, 31);
        while (!from.equals(to)) {
            if (isLeapYear(from)) {
                sum++;
            }
            from = from.plusDays(1);
        }
        if (isLeapYear(to)) {
            sum++;
        }
        System.out.println(sum);
        scan.close();
    }

    private static boolean isLeapYear(LocalDate localDate) {
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        return getsum(year) == getsum(month) + getsum(day);
    }

    private static int getsum(int one) {
        int sum = 0;
        while (one != 0) {
            sum += one % 10;
            one /= 10;
        }
        return sum;
    }
}