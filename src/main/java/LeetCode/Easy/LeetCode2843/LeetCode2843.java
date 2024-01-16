package LeetCode.Easy.LeetCode2843;

/**
 * @ClassName LeetCode2843
 * @Description TODO
 * @Author point
 * @Date 2023/9/19 23:00
 * @Version 1.0
 */
class Solution {
    boolean ishuiwen(int n) {
        String str = String.valueOf(n);
        int size = str.length() / 2;
        if (str.length() % 2 != 0) {
            return false;
        }
        int left = 0;
        int right = 0;
        for (int i = 0, j = size; i < size; i++, j++) {
            left += str.charAt(i) - '0';
            right += str.charAt(j) - '0';
        }
        return left == right;
    }

    public int countSymmetricIntegers(int low, int high) {
        int res = 0;
        for (int i = low; i <= high; i++) {
            if (ishuiwen(i)) {
                res++;
            }
        }
        return res;
    }
}

public class LeetCode2843 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.countSymmetricIntegers(1200, 1230);
    }
}
