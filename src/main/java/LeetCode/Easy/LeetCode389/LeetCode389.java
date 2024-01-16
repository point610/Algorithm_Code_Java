package LeetCode.Easy.LeetCode389;

/**
 * @ClassName LeetCode389
 * @Description TODO
 * @Author point
 * @Date 2023/7/14 22:40
 * @Version 1.0
 */
class Solution {
    int[] temp = new int[26];

    public char findTheDifference(String s, String t) {
        if (s == "") {
            return t.charAt(0);
        }
        int size = s.length();
        for (int i = 0; i < size; i++) {
            temp[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < size + 1; i++) {
            temp[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (temp[i] != 0) {
                return (char) ('a' + i);
            }
        }
        return 0;
    }
}

public class LeetCode389 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findTheDifference("", "y"));
    }
}
