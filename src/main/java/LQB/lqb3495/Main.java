package LQB.lqb3495;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        LocalDate one = LocalDate.of(2000, 1, 1);
        LocalDate two = LocalDate.of(2000000, 1, 2);
        long sum = 0;
        while (!one.equals(two)) {
            if (can(one)) {
                sum++;
            }
            one = one.plusDays(1);
        }
        System.out.println(sum);

    }

    private static boolean can(LocalDate date) {
        int year = date.getYear();
        int monthValue = date.getMonthValue();
        int day = date.getDayOfMonth();
        return year % monthValue == 0 && year % day == 0;
    }

}