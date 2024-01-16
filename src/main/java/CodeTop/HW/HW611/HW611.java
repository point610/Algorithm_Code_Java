package CodeTop.HW.HW611;

import java.util.Arrays;

/**
 * @ClassName HW611
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 11:26
 * @Version 1.0
 */
class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int size = nums.length;
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                for (int k = j + 1; k < size; k++) {
                    if (is(nums[i], nums[j], nums[k])) {
                        count++;
                    } else {
                        break;
                    }
                }
            }

        }
        return count;
    }

    private boolean is(int one, int two, int three) {
        return three < one + two;
    }
}

public class HW611 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.triangleNumber(new int[]{2, 2, 3, 4}));
        System.out.println(solution.triangleNumber(new int[]{4, 2, 3, 4}));
    }
}
