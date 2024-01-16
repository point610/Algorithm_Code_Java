package LeetCode.Easy.LeetCode1360;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName LeetCode1360
 * @Description TODO
 * @Author point
 * @Date 2023/9/17 11:29
 * @Version 1.0
 */
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        LocalDate one = LocalDate.parse(date1, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate two = LocalDate.parse(date2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return (int) Math.abs(one.toEpochDay() - two.toEpochDay());
    }
}

public class LeetCode1360 {
}
