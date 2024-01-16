package CodeTop.HW.HW1004;

/**
 * @ClassName HW1004
 * @Description TODO
 * @Author point
 * @Date 2023/12/26 9:47
 * @Version 1.0
 */
class Solution {
    public int longestOnes(int[] nums, int k) {
        int size = nums.length;
        int left = 0;
        int right = 0;

        int zeronumber = 0;
        int max = 0;
        if (k == 0) {
            int count = 0;
            for (int i = 0; i < size; i++) {
                if (nums[i] == 0) {
                    count = 0;
                    max = Math.max(max, count);
                } else {
                    count++;
                    max = Math.max(max, count);
                }
            }
            return max;
        }

        while (right < size) {
            if (nums[right] == 1) {
                right++;
            } else {
                if (zeronumber == k) {
                    while (left < size && nums[left] == 1) {
                        left++;
                    }
                    left++;
                    zeronumber--;
                }

                zeronumber++;
                right++;
            }
            max = Math.max(max, right - left);

        }
        return max;
    }
}

public class HW1004 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestOnes(new int[]{
                1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0
        }, 2));
        System.out.println(solution.longestOnes(new int[]{
                0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1
        }, 3));
    }
}
