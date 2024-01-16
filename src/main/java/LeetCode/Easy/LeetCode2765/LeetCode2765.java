package LeetCode.Easy.LeetCode2765;

/**
 * @ClassName LeetCode2765
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 13:34
 * @Version 1.0
 */
class Solution {
    public int alternatingSubarray(int[] nums) {
        int size = nums.length;
        int maxlength = -1;
        for (int i = 0; i < size - 1; i++) {

            if (nums[i] + 1 == nums[i + 1]) {
                int tempmax = 1;

                boolean addone = true;
                while (i < size - 1) {
                    if (addone) {
                        if (nums[i] + 1 == nums[i + 1]) {
                            tempmax++;
                            maxlength = Math.max(maxlength, tempmax);
                            addone = false;
                        } else {
                            maxlength = Math.max(maxlength, tempmax);
                            break;
                        }
                    } else {
                        if (nums[i] - 1 == nums[i + 1]) {
                            tempmax++;
                            maxlength = Math.max(maxlength, tempmax);
                            addone = true;
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

public class LeetCode2765 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.alternatingSubarray(new int[]{4, 5, 6}));
    }
}
