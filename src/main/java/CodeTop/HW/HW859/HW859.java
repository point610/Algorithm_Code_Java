package CodeTop.HW.HW859;

/**
 * @ClassName HW859
 * @Description TODO
 * @Author point
 * @Date 2023/12/24 19:53
 * @Version 1.0
 */
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        int[] one = new int[26];
        int[] two = new int[26];

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            one[s.charAt(i) - 'a']++;
            two[goal.charAt(i) - 'a']++;
            if (s.charAt(i) != goal.charAt(i)) {
                count++;
            }
        }
        int temp = 0;
        for (int i = 0; i < 26; i++) {
            if (one[i] != two[i]) {
                return false;
            }
            temp = Math.max(temp, one[i]);
            temp = Math.max(temp, two[i]);
        }

        // 不存在相同的字母，并且两个字符串相同
        if (temp <= 1 && s.equals(goal)) {
            return false;
        }

        return count <= 2;

    }
}

public class HW859 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.buddyStrings("ab", "ba"));
        System.out.println(solution.buddyStrings("ab", "ab"));
        System.out.println(solution.buddyStrings("aa", "aa"));
        System.out.println(solution.buddyStrings("abcd", "badc"));
        System.out.println(solution.buddyStrings("abc", "bca"));
    }
}
