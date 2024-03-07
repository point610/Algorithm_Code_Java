package LeetCode.Middle.LeetCode2575;


import java.util.Arrays;

class Solution {
    public int[] divisibilityArray(String word, int m) {
        int[] res = new int[word.length()];
        long current = 0;
        for (int i = 0; i < word.length(); i++) {
            char cc = word.charAt(i);
            current = ((current * 10) + (cc - '0')) % m;
            if (current == 0) {
                res[i] = 1;
            }
        }

        return res;
    }
}

public class LeetCode2575 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.divisibilityArray("998244353", 3)));
        System.out.println(Arrays.toString(solution.divisibilityArray("1010", 10)));
    }
}
