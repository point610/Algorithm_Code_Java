package LeetCode.Easy.LeetCode2027;

/**
 * @ClassName LeetCode2027
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 1:22
 * @Version 1.0
 */
class Solution {
    public int minimumMoves(String s) {
        int size = s.length();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == 'X') {
                sum++;
                i += 2;
            }
        }
        return sum;
    }
}

public class LeetCode2027 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minimumMoves("XXX"));
    }
}
