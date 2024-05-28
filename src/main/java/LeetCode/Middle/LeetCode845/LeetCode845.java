package LeetCode.Middle.LeetCode845;

class Solution {
    public int longestMountain(int[] arr) {

        int res = 0;

        int size = arr.length;
        for (int i = 1; i < size - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                int left = i;
                int right = i;
                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }
                while (right < size - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }
                res = Math.max(res, right - left + 1);
            }

        }

        return res;
    }
}

public class LeetCode845 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestMountain(new int[]{2, 1, 4, 7, 3, 2, 5}));
        System.out.println(solution.longestMountain(new int[]{2, 2, 2}));
    }
}
