package LeetCode.Middle.LeetCode1769;

/**
 * @ClassName LeetCode1769
 * @Description TODO
 * @Author point
 * @Date 2023/7/16 23:06
 * @Version 1.0
 */
class Solution {

    public int[] minOperations(String boxes) {
        int size = boxes.length();

        // ------------------------
        int[][] left = new int[size][2];
        int[][] right = new int[size][2];
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                left[i][0] = 0;
                left[i][1] = (boxes.charAt(i) - '0');
                continue;
            }
            left[i][0] = left[i - 1][0] + left[i - 1][1];
            left[i][1] = left[i - 1][1] + (boxes.charAt(i) - '0');
        }
        for (int i = size - 1; i >= 0; i--) {
            if (i == size - 1) {
                right[i][0] = 0;
                right[i][1] = (boxes.charAt(i) - '0');
                continue;
            }
            right[i][0] = right[i + 1][0] + right[i + 1][1];
            right[i][1] = right[i + 1][1] + (boxes.charAt(i) - '0');
        }
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = (left[i][0] + right[i][0]);
        }
        return res;
    }
}

public class LeetCode1769 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.minOperations("001011");
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
