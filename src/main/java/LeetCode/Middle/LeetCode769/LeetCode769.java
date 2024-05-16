package LeetCode.Middle.LeetCode769;

class Solution {
    public int maxChunksToSorted(int[] arr) {
        int res = 0;

        int right = 0;

        for (int i = 0; i < arr.length; ++i) {

            right = Math.max(right, arr[i]);

            if (right == i) {
                ++res;
            }

            // 注意这里不能用else，因为如果right==i，那么下一轮循环的i还是i，
            // 如果不加else，那么下一轮循环的i就会比本轮循环的i大1，从而导致漏掉一种情况
        }

        return res;
    }
}

public class LeetCode769 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxChunksToSorted(new int[]{4, 3, 2, 1, 0}));
        System.out.println(solution.maxChunksToSorted(new int[]{1, 0, 2, 3, 4}));
    }
}
