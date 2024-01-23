package CodeTop.HW.HW396;

class Solution {
    public int maxRotateFunction(int[] nums) {
        int size = nums.length;

        int[] ll = new int[size * 2];
        int sum = 0;
        int all = 0;
        for (int i = 0; i < size; i++) {
            sum += nums[i];
            all += (i * nums[i]);
            ll[i] = nums[i];
            ll[i + size] = nums[i];
        }
        int max = all;
        int left = 0;
        int right = size;
        int end = size + size;
        while (right != end) {
            all = all - sum + ll[left];
            all = all + (size - 1) * ll[right];
            max = Math.max(max, all);

            sum -= ll[left];
            sum += ll[right];

            left++;
            right++;
        }

        return max;
    }


}

public class HW396 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxRotateFunction(new int[]{4, 3, 2, 6}));
        System.out.println(solution.maxRotateFunction(new int[]{100}));
    }
}
