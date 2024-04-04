package LeetCode.Middle.LeetCode275;

class Solution {
    public int hIndex(int[] citations) {
        int left = 0;
        int size = citations.length;
        int right = citations.length - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (citations[mid] < size - mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return size - left;
    }
}

public class LeetCode275 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hIndex(new int[]{0, 1, 3, 5, 6}));
        System.out.println(solution.hIndex(new int[]{1, 2, 100}));
    }
}
