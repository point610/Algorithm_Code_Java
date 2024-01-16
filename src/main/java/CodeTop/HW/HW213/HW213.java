package CodeTop.HW.HW213;

/**
 * @ClassName HW213
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 21:26
 * @Version 1.0
 */
class Solution {
    public int rob(int[] nums) {
        int size = nums.length;
        if (size == 1) {
            return nums[0];
        }
        if (size == 2) {
            return Math.max(nums[0], nums[1]);
        }

        // 不偷第一个
        int[] one = new int[size + 1];
        // 不偷最后一个
        int[] two = new int[size + 1];

        one[0] = 0;
        one[1] = 0;
        for (int i = 2; i <= size; i++) {
            one[i] = Math.max(one[i - 2] + nums[i - 1], one[i - 1]);
        }

        two[0] = 0;
        two[1] = nums[0];
        for (int i = 2; i <= size; i++) {
            if (i - 1 == size - 1) {
                two[i] = two[i - 1];
                continue;
            }
            two[i] = Math.max(two[i - 2] + nums[i - 1], two[i - 1]);
        }

        return Math.max(one[size], two[size]);

    }
}

public class HW213 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.rob(new int[]{2, 3, 2}));
        System.out.println(solution.rob(new int[]{1, 2, 3, 1}));
    }
}
