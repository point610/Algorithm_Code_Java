package LeetCode.Easy.LeetCode2614;

/**
 * @ClassName LeetCode2614
 * @Description TODO
 * @Author point
 * @Date 2023/10/3 12:20
 * @Version 1.0
 */
class Solution {
    boolean iszhishu(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int diagonalPrime(int[][] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (iszhishu(nums[i][nums.length - i - 1])) {
                max = Math.max(max, nums[i][nums.length - i - 1]);
            }
            if (iszhishu(nums[i][i])) {
                max = Math.max(max, nums[i][i]);
            }
        }
        return max;
    }
}

public class LeetCode2614 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.iszhishu(3));
    }
}
