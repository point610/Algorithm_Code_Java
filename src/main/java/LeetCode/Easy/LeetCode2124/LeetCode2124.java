package LeetCode.Easy.LeetCode2124;

/**
 * @ClassName LeetCode2124
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 22:30
 * @Version 1.0
 */
class Solution {
    public boolean checkString(String s) {
        int size = s.length();
        boolean first = true;
        for (int i = 0; i < size; i++) {
            if (first && s.charAt(i) == 'b') {
                first = false;
            }
            if (!first && s.charAt(i) == 'a') {
                return false;
            }
        }
        return true;
    }
}

public class LeetCode2124 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.checkString("aaaaaa"));
    }
}
