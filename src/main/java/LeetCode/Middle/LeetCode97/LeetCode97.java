package LeetCode.Middle.LeetCode97;

/**
 * @ClassName LeetCode97
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 17:23
 * @Version 1.0
 */
class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {


        int oneSize = s1.length();
        int twoSize = s2.length();
        int threeSize = s3.length();
        if (oneSize == 0 && twoSize == 0 && threeSize == 0) {
            return true;
        }
        if (oneSize + twoSize != threeSize || threeSize == 0 || (oneSize == 0 && !s2.equals(s3)) || (twoSize == 0 && !s1.equals(s3))) {
            return false;
        }
        // 使用二维数组，动态规划
        boolean[][] sign = new boolean[oneSize + 1][twoSize + 1];
        sign[0][0] = true;
        for (int i = 0; i <= oneSize; i++) {
            for (int j = 0; j <= twoSize; j++) {

                int threeIndex = i + j - 1;
                if (i > 0) {
                    sign[i][j] = sign[i][j] || (sign[i - 1][j] && s1.charAt(i - 1) == s3.charAt(threeIndex));
                }
                if (j > 0) {
                    sign[i][j] = sign[i][j] || (sign[i][j - 1] && s2.charAt(j - 1) == s3.charAt(threeIndex));
                }
            }
        }
        return sign[oneSize][twoSize];
    }
}

public class LeetCode97 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isInterleave("a", "", "a"));
    }
}
