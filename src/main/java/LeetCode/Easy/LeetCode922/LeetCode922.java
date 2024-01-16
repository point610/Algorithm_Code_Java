package LeetCode.Easy.LeetCode922;

/**
 * @ClassName LeetCode922
 * @Description TODO
 * @Author point
 * @Date 2023/8/13 22:30
 * @Version 1.0
 */
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int size = nums.length;
        int ouIndex = 0;
        int jiIndex = 1;
        while (ouIndex < size && jiIndex < size) {
            while (ouIndex < size && nums[ouIndex] % 2 == 0) {
                ouIndex += 2;
            }
            while (jiIndex < size && nums[jiIndex] % 2 == 1) {
                jiIndex += 2;
            }
            // 交换
            if (ouIndex < size && jiIndex < size) {

                int temp = nums[ouIndex];
                nums[ouIndex] = nums[jiIndex];
                nums[jiIndex] = temp;
                ouIndex += 2;
                jiIndex += 2;
            }
        }
        return nums;
    }
}

public class LeetCode922 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.sortArrayByParityII(new int[]{4, 2, 5, 7});
    }
}
