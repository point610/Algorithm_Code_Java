package LeetCode.Easy.LeetCode1422;

/**
 * @ClassName LeetCode1422
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 0:10
 * @Version 1.0
 */
class Solution {

    public int maxScore(String s) {
        int onesize = 0;
        int zerosize = s.charAt(0) == '0' ? 1 : 0;
        int size = s.length();
        for (int i = 1; i < size; i++) {
            if (s.charAt(i) == '1') {
                onesize++;
            }
        }
        int max = onesize + zerosize;
        for (int i = 1; i < size - 1; i++) {
            if (s.charAt(i) == '0') {
                zerosize++;
            } else {
                onesize--;
            }
            max = Math.max(max, onesize + zerosize);
        }
        return max;

    }
}

public class LeetCode1422 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxScore("011101"));
    }
}
