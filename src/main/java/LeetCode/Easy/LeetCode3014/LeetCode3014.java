package LeetCode.Easy.LeetCode3014;

import java.util.Arrays;

class Solution {
    public int minimumPushes(String word) {
        int[] templll = new int[26];
        for (char cc : word.toCharArray()) {
            templll[cc - 'a']++;
        }
        Arrays.sort(templll);
        for (int i = 0, j = 25; i < 13; j--, i++) {
            int temp = templll[i];
            templll[i] = templll[j];
            templll[j] = temp;
        }

        int tiems = 0;

        for (int i = 0; i < 8; i++) {
            tiems += templll[i];
        }

        for (int i = 0; i < 8; i++) {
            tiems += templll[i + 8] * 2;
        }

        for (int i = 0; i < 8; i++) {
            tiems += templll[i + 16] * 3;
        }
        for (int i = 0; i < 2; i++) {
            tiems += templll[i + 24] * 4;
        }

        return tiems;
    }
}

public class LeetCode3014 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minimumPushes("abcde"));
        System.out.println(solution.minimumPushes("xycdefghij"));
    }
}
