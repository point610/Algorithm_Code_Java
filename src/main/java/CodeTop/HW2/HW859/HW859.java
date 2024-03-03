package CodeTop.HW2.HW859;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean buddyStrings(String s, String goal) {
        int size = s.length();
        if (s.length() != goal.length()) {
            return false;
        }
        int diff = diff(s, goal);
        if (diff == 2) {

            int left = 0;
            int right = s.length() - 1;
            while (left < right && s.charAt(left) == goal.charAt(left)) {
                left++;
            }
            while (left < right && s.charAt(right) == goal.charAt(right)) {
                right--;
            }

            return goal.charAt(left) == s.charAt(right) && s.charAt(left) == goal.charAt(right);

        } else if (diff == 0) {
            return hassame(s);
        }
        return false;
    }

    private int diff(String s, String goal) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean hassame(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                return true;
            } else {
                set.add(s.charAt(i));
            }
        }
        return false;
    }
}

public class HW859 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.buddyStrings("ab", "ba"));
        System.out.println(solution.buddyStrings("ab", "ab"));
        System.out.println(solution.buddyStrings("aa", "aa"));
    }
}
