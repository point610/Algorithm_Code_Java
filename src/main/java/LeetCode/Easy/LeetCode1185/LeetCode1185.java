package LeetCode.Easy.LeetCode1185;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @ClassName LeetCode1185
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 20:43
 * @Version 1.0
 */
class Solution {

    public String dayOfTheWeek(int day, int month, int year) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(year);
        stringBuilder.append('-');
        if (month >= 10) {
            stringBuilder.append(month);
        } else {
            stringBuilder.append(0);
            stringBuilder.append(month);
        }
        stringBuilder.append('-');
        if (day >= 10) {
            stringBuilder.append(day);
        } else {
            stringBuilder.append(0);
            stringBuilder.append(day);
        }
        DayOfWeek dayOfWeek = LocalDate.parse(stringBuilder).getDayOfWeek();
        String[] res = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};
        return res[dayOfWeek.getValue()+1];
    }
}

public class LeetCode1185 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.dayOfTheWeek(18, 7, 1999));
    }
}
