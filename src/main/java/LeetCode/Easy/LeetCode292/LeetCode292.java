package LeetCode.Easy.LeetCode292;

/**
 * @ClassName LeetCode292
 * @Description TODO
 * @Author point
 * @Date 2023/7/13 22:44
 * @Version 1.0
 */
class Solution {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}

public class LeetCode292 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canWinNim(8));
    }

}
