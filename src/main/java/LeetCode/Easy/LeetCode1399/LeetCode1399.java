package LeetCode.Easy.LeetCode1399;

/**
 * @ClassName LeetCode1399
 * @Description TODO
 * @Author point
 * @Date 2023/9/24 22:50
 * @Version 1.0
 */
class Solution {
    int getNumber(int n) {
        String string = String.valueOf(n);
        int size = string.length();
        int res = 0;
        for (int i = 0; i < size; i++) {
            res += (string.charAt(i) - '0');
        }
        return res;
    }

    public int countLargestGroup(int n) {
        int[] arr = new int[37];
        for (int i = 1; i <= n; i++) {
            arr[getNumber(i)]++;
        }
        int max = 0;
        for (int i = 36; i >= 0; i--) {
            max = Math.max(max, arr[i]);
        }
        int res = 0;
        for (int i = 1; i <= 36; i++) {
            if (arr[i] == max) {
                res++;
            }
        }
        return res;
    }
}

public class LeetCode1399 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.countLargestGroup(13);
    }
}
