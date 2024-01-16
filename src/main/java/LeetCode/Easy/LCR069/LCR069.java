package LeetCode.Easy.LCR069;

/**
 * @ClassName LCR069
 * @Description TODO
 * @Author point
 * @Date 2023/10/7 23:39
 * @Version 1.0
 */
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if (arr.length == 3) {
            return 1;
        }
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
                left = mid;
            }
            if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1]) {
                right = mid;
            }
        }
        return left;
    }
}

public class LCR069 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.peakIndexInMountainArray(new int[]{1,3,5,4,2}));
    }
}
