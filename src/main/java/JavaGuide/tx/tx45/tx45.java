package JavaGuide.tx.tx45;

class Solution {
    public int jump(int[] nums) {
        int size = nums.length;
        int border = 0;
        int end = 0;
        int times = 0;
        // 不能计算最后一个元素，因为一定能够到达最后一个元素，
        // 但是border不一定在最后一个元素的下标，最后无法通过-1来校准
        for (int i = 0; i < size - 1; i++) {
            end = Math.max(end, i + nums[i]);
            if (i == border) {
                times++;
                border = end;
            }
        }
        return times;
    }
}

public class tx45 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.jump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(solution.jump(new int[]{2, 3, 0, 1, 4}));
    }
}
