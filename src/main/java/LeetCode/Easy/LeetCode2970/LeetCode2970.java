package LeetCode.Easy.LeetCode2970;

/**
 * @ClassName LeetCode2970
 * @Description TODO
 * @Author point
 * @Date 2024/1/17 0:04
 * @Version 1.0
 */
class Solution {
    public int incremovableSubarrayCount(int[] nums) {

        int size = nums.length;
        int i = 0;
        while (i < size - 1 && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == size - 1) {
            return (size + 1) * size / 2;
        }

        int aaa = i + 2;
        for (int j = size - 1; j == size - 1 || nums[j] < nums[j + 1]; j--) {
            while (i >= 0 && nums[i] >= nums[j]) {
                i--;
            }
            aaa += (i + 2);
        }
        return aaa;
    }
}

public class LeetCode2970 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.incremovableSubarrayCount(new int[]{8, 7, 6, 6}));
    }
}
