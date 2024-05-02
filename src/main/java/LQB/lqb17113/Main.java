package LQB.lqb17113;

import java.time.LocalDate;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        System.out.println(1333);
        //int res = 0;
        //LocalDate start = LocalDate.of(2023, 1, 1);
        //LocalDate end = LocalDate.of(2024, 1, 1);
        //while (!start.equals(end)) {
        //    if (hasone(start)) {
        //        res += 5;
        //    } else {
        //        res += 1;
        //    }
        //    start = start.plusDays(1);
        //}
        //System.out.println(res);
    }

    private static boolean hasone(LocalDate one) {
        int month = one.getMonthValue();
        int day = one.getDayOfMonth();
        int week = one.getDayOfWeek().getValue();
        System.out.println(week);

        return Integer.toString(month).contains("1") || Integer.toString(day).contains("1") || week == 1;
    }

}