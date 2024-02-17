package CodeTop.TX.TX409;

class Solution {
    public int longestPalindrome(String s) {
        int[] da = new int[26];
        int[] xiao = new int[26];
        for (char cc : s.toCharArray()) {
            if (Character.isLowerCase(cc)) {
                xiao[cc - 'a']++;
            } else {
                da[cc - 'A']++;
            }
        }
        int sum = 0;
        boolean jishu = false;
        for (int i = 0; i < 26; i++) {
            if (da[i] % 2 == 1) {
                jishu = true;
                sum += (da[i] - 1);
            } else {
                sum += (da[i]);
            }
        }
        for (int i = 0; i < 26; i++) {
            if (xiao[i] % 2 == 1) {
                jishu = true;
                sum += (xiao[i] - 1);
            } else {
                sum += (xiao[i]);
            }
        }
        if (jishu) {
            return sum + 1;
        } else {
            return sum;
        }

    }
}

public class TX409 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("ccc"));
    }
}
