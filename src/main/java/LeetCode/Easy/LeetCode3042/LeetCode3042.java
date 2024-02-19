package LeetCode.Easy.LeetCode3042;

class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int size = words.length;
        int res = 0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (is(words[i], words[j])) {
                    res++;
                }
            }
        }

        return res;
    }

    private boolean is(String one, String two) {
        //if (one.length() < two.length()) {
        //    String temp = one;
        //    one = two;
        //    two = temp;
        //}
        if (one.length() > two.length()) {
            return false;
        }
        String temp = one;
        one = two;
        two = temp;
        for (int i = 0; i < two.length(); i++) {
            if (one.charAt(i) != two.charAt(i)) {
                return false;
            }
        }
        for (int i = two.length() - 1, j = one.length() - 1; i >= 0; j--, i--) {
            if (one.charAt(j) != two.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

public class LeetCode3042 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countPrefixSuffixPairs(new String[]{"abab", "ab"}));
    }
}
