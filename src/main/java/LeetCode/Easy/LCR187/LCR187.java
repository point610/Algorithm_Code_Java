package LeetCode.Easy.LCR187;

/**
 * @ClassName LCR187
 * @Description TODO
 * @Author point
 * @Date 2023/10/9 23:33
 * @Version 1.0
 */
class Solution {
    public int iceBreakingGame(int num, int target) {
        return F(num, target);
    }

    private int F(int num, int target) {
        if (num == 1) {
            return 0;
        }
        int x = F(num - 1, target);
        return (target + x) % num;

    }
}

public class LCR187 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.iceBreakingGame(12, 5));

    }
}
