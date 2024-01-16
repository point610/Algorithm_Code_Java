package LeetCode.Easy.LeetCode2475;

/**
 * @ClassName LeetCode2475
 * @Description TODO
 * @Author point
 * @Date 2023/10/2 12:34
 * @Version 1.0
 */
class Solution {
    public int unequalTriplets(int[] nums) {
        int size = nums.length;
        int sum = 0;
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                for (int k = j + 1; k < size; k++) {
                    if (nums[i] != nums[j] && nums[i] != nums[k] && nums[j] != nums[k]) {
                        sum++;
                    }
                }
            }
        }
        return sum;
    }
}

public class LeetCode2475 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.unequalTriplets(new int[]{
                4, 4, 2, 4, 3
        }));
    }
}
