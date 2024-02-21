package CodeTop.TX.TX213;

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

        // 0下标为对齐位
        one[0] = 0;
        // 1下标为第一个
        one[1] = 0;
        for (int i = 2; i <= size; i++) {
            int current = nums[i - 1];
            one[i] = Math.max(one[i - 2] + current, one[i - 1]);
        }

        // 0下标为对齐位
        two[0] = 0;
        // 1下标为第一个
        two[1] = nums[0];
        for (int i = 2; i <= size; i++) {
            if (i == size) {
                // 最后一个
                two[i] = two[i - 1];
                break;
            }
            int current = nums[i - 1];
            two[i] = Math.max(two[i - 2] + current, two[i - 1]);
        }

        return Math.max(one[size], two[size]);
    }
}

public class TX213 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.rob(new int[]{2, 3, 2}));
        System.out.println(solution.rob(new int[]{1, 2, 3, 1}));
        System.out.println(solution.rob(new int[]{1, 2, 3}));
    }
}
