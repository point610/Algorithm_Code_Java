package CodeTop.HW.HW11;

/**
 * @ClassName HW11
 * @Description TODO
 * @Author point
 * @Date 2023/12/25 20:44
 * @Version 1.0
 */
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int temp = Math.min(height[left], height[right]) * (right - left);

            max = Math.max(max, temp);
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return max;
    }
}

public class HW11 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(solution.maxArea(new int[]{1, 1}));

    }
}
