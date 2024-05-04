package LeetCode.Easy.LeetCode3120;

class Solution {
    public int numberOfSpecialChars(String word) {
        int[] da = new int[26];
        int[] xiao = new int[26];

        for (char cc : word.toCharArray()) {
            if (Character.isUpperCase(cc)) {
                da[cc - 'A']++;
            } else {
                xiao[cc - 'a']++;
            }
        }

        int res = 0;
        for (int i = 0; i < 26; i++) {
            if (da[i] > 0 && xiao[i] > 0) {
                res++;
            }
        }
        return res;
    }
}

public class LeetCode3120 {
}
