package LeetCode.Easy.AOffer.LeetCode53;

/**
 * @ClassName LeetCode53
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 13:35
 * @Version 1.0
 */
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        int size = nums.length;
        while (left <= right) {
            mid = (left + right) / 2;

            if (nums[mid] == target) {
                // 找到了
                int res = 1;
                for (int i = mid - 1; i >= 0 && nums[i] == target; i--) {
                    res++;
                }
                for (int i = mid + 1; i < size && nums[i] == target; i++) {
                    res++;
                }
                return res;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }


        return 0;

    }
}

public class LeetCode53 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[]{1}, 1));
    }
}
