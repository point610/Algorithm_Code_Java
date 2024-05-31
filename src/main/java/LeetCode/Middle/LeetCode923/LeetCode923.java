package LeetCode.Middle.LeetCode923;

import java.util.Arrays;

class Solution {
    public int threeSumMulti(int[] arr, int target) {
        Arrays.sort(arr);
        int res = 0;
        int size = arr.length;
        for (int i = 0; i < size - 2; i++) {

            int left = i + 1;
            int right = size - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    int ll = left;
                    int rr = right;

                    while (left < right && arr[left] == arr[left + 1]) {
                        left++;
                    }
                    while (left < right && arr[right] == arr[right - 1]) {
                        right--;
                    }

                    int tempadd = (left - ll) * (rr - right) / 2;
                    res = (res + tempadd) % 100000007;

                } else if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return res;
    }
}

public class LeetCode923 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.threeSumMulti(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5}, 8));
    }
}
