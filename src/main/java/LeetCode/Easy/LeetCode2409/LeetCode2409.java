package LeetCode.Easy.LeetCode2409;

import java.time.LocalDate;

/**
 * @ClassName LeetCode2409
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 16:07
 * @Version 1.0
 */
class Solution {
    private String YEAR = "2021-";

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int aa = LocalDate.parse(YEAR + arriveAlice).getDayOfYear();
        int la = LocalDate.parse(YEAR + leaveAlice).getDayOfYear();
        int ab = LocalDate.parse(YEAR + arriveBob).getDayOfYear();
        int lb = LocalDate.parse(YEAR + leaveBob).getDayOfYear();

        if (la < ab || aa > lb) {
            return 0;
        }
        if (aa <= ab && la >= lb) {
            return lb - ab + 1;
        }
        if (aa >= ab && la <= lb) {
            return la - aa + 1;
        }
        if (la > ab && la < lb) {
            return la - ab + 1;
        } else if (lb > aa && lb < la) {
            return lb - aa + 1;
        }
        return 1;

    }
}

public class LeetCode2409 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countDaysTogether("08-06", "12-08", "02-04", "09-01"));
    }
}
