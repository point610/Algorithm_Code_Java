package LeetCode.Middle.LeetCode567;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int size = s1.length();
        if (size == 1) {
            return s2.contains(s1);
        }
        int[] one = getlist(s1);
        int[] two = new int[26];
        int left = 0;
        int right = 0;
        for (int i = 0; i < size; i++) {
            two[s2.charAt(i) - 'a']++;
        }
        right = size - 1;
        while (right <= s2.length()) {
            if (same(one, two)) {
                return true;
            }
            two[s2.charAt(left) - 'a']--;
            left++;
            right++;
            if (right < s2.length()) {
                two[s2.charAt(right) - 'a']++;
            }
        }
        return false;
    }

    private boolean same(int[] one, int[] two) {
        for (int i = 0; i < 26; i++) {
            if (one[i] != two[i]) {
                return false;
            }
        }
        return true;
    }

    private int[] getlist(String one) {
        int[] list = new int[26];
        for (char cc : one.toCharArray()) {
            list[cc - 'a']++;
        }
        return list;
    }
}

public class LeetCode567 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.checkInclusion("adc", "dcda"));
    }
}
