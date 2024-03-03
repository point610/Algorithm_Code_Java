package CodeTop.HW2.HW796;

class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        for (int i = 0; i < goal.length(); i++) {
            if (s.charAt(0) == goal.charAt(i)) {
                if (same(s, goal, i)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean same(String s, String goal, int oneindex) {

        for (int i = 0, j = oneindex; i < s.length(); i++, j = (j + 1) % goal.length()) {
            if (s.charAt(i) != goal.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}

public class HW796 {
}
