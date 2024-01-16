package LeetCode.Easy.LCS01;

/**
 * @ClassName LCS01
 * @Description TODO
 * @Author point
 * @Date 2023/10/10 19:09
 * @Version 1.0
 */
class Solution {


    public int leastMinutes(int n) {
        int temp = 1;
        int times = 0;
        while (temp < n) {
            temp *= 2;
            times++;
        }
        return times + 1;
    }
}

public class LCS01 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.leastMinutes(2));
    }
}
