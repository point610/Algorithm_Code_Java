package CodeTop.HW.HW122;

/**
 * @ClassName HW122
 * @Description TODO
 * @Author point
 * @Date 2023/12/23 20:34
 * @Version 1.0
 */
class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                sum += (prices[i] - prices[i - 1]);
            }
        }return sum;
    }
}

public class HW122 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{
                7, 1, 5, 3, 6, 4
        }));
        System.out.println(solution.maxProfit(new int[]{
                1, 2, 3, 4, 5
        }));
        System.out.println(solution.maxProfit(new int[]{
                7, 6, 4, 3, 1
        }));
    }
}
