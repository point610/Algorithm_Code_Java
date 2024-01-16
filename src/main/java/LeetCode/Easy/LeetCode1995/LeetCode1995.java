package LeetCode.Easy.LeetCode1995;

/**
 * @ClassName LeetCode1995
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 0:55
 * @Version 1.0
 */
class Solution {


    public int countQuadruplets(int[] nums) {
int sum=0;        int size = nums.length;
        for (int i = 0; i < size - 3; i++) {
            for (int j = i + 1; j < size - 2; j++) {
                for (int k = j + 1; k < size - 1; k++) {
                    for (int l = k + 1; l < size; l++) {
                        int temp = nums[i] + nums[j] + nums[k];
                        if (temp == nums[l]) {
                            sum++;
                        }

                    }
                }
            }
        }
        return sum;
    }
}

public class LeetCode1995 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countQuadruplets(new int[]{28, 8, 49, 85, 37, 90, 20, 8}));
    }
}
