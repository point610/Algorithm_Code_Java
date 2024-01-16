package LeetCode.Easy.LeetCode2729;

/**
 * @ClassName LeetCode2729
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 12:47
 * @Version 1.0
 */
class Solution {
    public boolean isFascinating(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.valueOf(n));
        stringBuilder.append(String.valueOf(n * 2));
        stringBuilder.append(String.valueOf(n * 3));
        int size = stringBuilder.length();
        int[] arr = new int[10];

        for (int i = 0; i < size; i++) {
            arr[stringBuilder.charAt(i) - '0']++;
        }
        if (arr[0] != 0) {
            return false;
        }
        for (int i = 1; i <= 9; i++) {
            if (arr[i] != 1) {
                return false;
            }
        }
        return true;
    }
}

public class LeetCode2729 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isFascinating(123));
    }
}
