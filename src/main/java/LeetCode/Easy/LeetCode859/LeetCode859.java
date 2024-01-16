package LeetCode.Easy.LeetCode859;

/**
 * @ClassName LeetCode859
 * @Description TODO
 * @Author point
 * @Date 2023/8/12 13:02
 * @Version 1.0
 */
class Solution {
    public boolean buddyStrings(String s, String goal) {
        int diffNumber = 0;
        int size = s.length();
        if (size != goal.length()) {
            return false;
        }

        int[] temp = new int[26];
        int[] sum = new int[26];
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                diffNumber++;
            } else {
                temp[s.charAt(i) - 'a']++;
            }
            sum[s.charAt(i)- 'a']++;
            sum[goal.charAt(i)- 'a']--;
        }
        boolean same = true;
        for (int i = 0; i < 26; i++) {
            if (sum[i] != 0) {
                return false;
            }
        }

        if (diffNumber == 2) {
            return true;
        }
        if (diffNumber == 0) {
            for (int i = 0; i < 26; i++) {
                if (temp[i] >= 2) {
                    return true;
                }
            }
        }
        return false;

    }
}

public class LeetCode859 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.buddyStrings("ab", "ba"));
    }
}
