package CodeTop.HW.HW42;

class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int sum = 0;
        int lllmax =height[0];
        int rrrmax = height[height.length-1];
        while (left < right) {
            int lllhhh = height[left];
            int rrrhhh = height[right];

            if (lllhhh == rrrhhh) {
                right--;
                rrrmax = Math.max(rrrmax, height[right]);
                sum += rrrmax - height[right];

            } else if (lllhhh < rrrhhh) {
                left++;
                lllmax = Math.max(lllmax, height[left]);
                sum += lllmax - height[left];

            } else {
                right--;
                rrrmax = Math.max(rrrmax, height[right]);
                sum += rrrmax - height[right];

            }
        }
        return sum;
    }
}

public class HW42 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.trap(new int[]{4, 2, 0, 3, 2, 5}));
        System.out.println(solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}
