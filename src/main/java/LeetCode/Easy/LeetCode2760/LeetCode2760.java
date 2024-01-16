package LeetCode.Easy.LeetCode2760;

/**
 * @ClassName LeetCode2760
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 13:16
 * @Version 1.0
 */
class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int size = nums.length;
        if (size <= 1) {
            return nums[0] % 2 == 0 && nums[0] <= threshold ? 1 : 0;
        }
        int maxlength = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] % 2 == 0 && nums[i] <= threshold) {
                int tempmax = 0;
                boolean oushu = true;
                while (i < size) {
                    if (oushu) {
                        if (nums[i] % 2 == 0 && nums[i] <= threshold) {
                            tempmax++;
                            oushu = false;
                            maxlength = Math.max(maxlength, tempmax);
                        } else {
                            maxlength = Math.max(maxlength, tempmax);
                            break;
                        }
                    } else {
                        if (nums[i] % 2 == 1 && nums[i] <= threshold) {
                            tempmax++;
                            oushu = true;
                            maxlength = Math.max(maxlength, tempmax);
                        } else {
                            maxlength = Math.max(maxlength, tempmax);
                            break;
                        }
                    }
                    i++;
                }
                i--;
            }
        }
        return maxlength;
    }
}

public class LeetCode2760 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestAlternatingSubarray(new int[]{4, 10, 3}, 10));
    }
}
