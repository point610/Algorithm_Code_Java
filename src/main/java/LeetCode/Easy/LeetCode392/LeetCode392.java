package LeetCode.Easy.LeetCode392;

/**
 * @ClassName LeetCode392
 * @Description TODO
 * @Author point
 * @Date 2023/7/15 0:00
 * @Version 1.0
 */
class Solution {
    public boolean isSubsequence(String s, String t) {
        if ("".equals(s)) {
            return true;
        }
        int index = 0;
        int tsize = t.length();
        int ssize = s.length();
        if (ssize > tsize) {
            return false;
        }
        for (int i = 0; i < tsize; i++) {
            if (s.charAt(index) == t.charAt(i)) {
                index++;
            }

            if (index >= ssize) {
                return true;
            }
        }
        return false;

    }
}

public class LeetCode392 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isSubsequence("", "ahbgdc"));
    }
}
