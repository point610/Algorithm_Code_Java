package LeetCode.Easy.LeetCode2806;

/**
 * @ClassName LeetCode2806
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 14:16
 * @Version 1.0
 */
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {

        return (int) (100 - Math.round(purchaseAmount / 10.0) * 10);
    }
}

public class LeetCode2806 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.accountBalanceAfterPurchase(15));
    }
}
