package LeetCode.Easy.LeetCode3090;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maximumLengthSubstring(String s) {
        int size = s.length();
        int[] list = new int[26];
        int left = 0;
        int max = 0;
        for (int i = 0; i < size; i++) {
            char cc = s.charAt(i);
            int index = cc - 'a';
            list[index]++;
            while (list[index] > 2) {
                char ccleft = s.charAt(left);
                int indexleft = ccleft - 'a';
                list[indexleft]--;
                left++;
            }
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}

public class LeetCode3090 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maximumLengthSubstring("bcbbbcba"));
        System.out.println(solution.maximumLengthSubstring("aaaa"));

    }
}
