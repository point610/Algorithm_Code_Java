package LeetCode.Easy.LeetCode1763;

/**
 * @ClassName LeetCode1763
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 17:14
 * @Version 1.0
 */
class Solution {
    StringBuilder res = new StringBuilder();

    // 使用滑动窗口
    void DFS(String s, int n) {
        for (int i = 0; i <= s.length() - n; i++) {
            String sub = s.substring(i, i + n);
            if (is(sub)) {
                if (sub.length() > res.length()) {
                    res = new StringBuilder(sub);
                }
            }
        }
    }

    boolean is(String s) {
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (s.indexOf(getother(s.charAt(i))) == -1) {
                return false;
            }
        }
        return true;
    }

    char getother(char temp) {
        if ('a' <= temp && temp <= 'z') {
            return (char) (temp - 32);
        }
        if ('A' <= temp && temp <= 'Z') {
            return (char) (temp + 32);
        }
        return 'a';
    }

    public String longestNiceSubstring(String s) {
        if (s.length() == 1) {
            return "";
        }
        int size = s.length();
        for (int i = size; i > 1; i--) {
            DFS(s, i);
        }
        return res.toString();
    }
}

public class LeetCode1763 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestNiceSubstring("xLeElzxgHzcWslEdgMGwEOZCXwwDMwcEhgJHLL"));
    }
}
