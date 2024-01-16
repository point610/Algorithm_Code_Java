package LeetCode.Easy.LeetCode1154;

import java.time.LocalDate;

/**
 * @ClassName LeetCode1154
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 20:21
 * @Version 1.0
 */
class Solution {
    public int dayOfYear(String date) {
        LocalDate localDate = LocalDate.parse(date);
        return localDate.getDayOfYear();
    }
}

public class LeetCode1154 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.dayOfYear("2019-02-10"));
    }
}
