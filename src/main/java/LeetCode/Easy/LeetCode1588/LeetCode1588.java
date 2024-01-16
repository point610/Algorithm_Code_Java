package LeetCode.Easy.LeetCode1588;

/**
 * @ClassName LeetCode1588
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 0:54
 * @Version 1.0
 */
class Solution {
    int getnumber(int[] arr, int n) {
        int res = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        res += sum;
        for (int i = 1; i <= arr.length - n; i++) {
            sum -= arr[i - 1];
            sum += arr[i - 1 + n];

            res += sum;

        }
        return res;

    }

    public int sumOddLengthSubarrays(int[] arr) {

        int sum = 0;
        int size = arr.length;
        for (int i = 0; i < size; i += 2) {
            sum += getnumber(arr, i + 1);
        }
        return sum;

    }
}

public class LeetCode1588 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.sumOddLengthSubarrays(new int[]{1,2}));
    }
}
