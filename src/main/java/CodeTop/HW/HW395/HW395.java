package CodeTop.HW.HW395;

import java.util.Arrays;

class Solution {
    public int longestSubstring(String s, int k) {
        int size = s.length();
        int max = 0;
        int[] count = new int[26];
        for (int types = 1; types <= 26; types++) {
            Arrays.fill(count, 0);
            int left = 0;
            int right = 0;
            int sumtypes = 0;
            int totaltype = 0;

            while (right < size) {
                int indextype = s.charAt(right) - 'a';
                count[indextype]++;
                if (count[indextype] == 1) {
                    totaltype++;
                }
                if (count[indextype] == k) {
                    sumtypes++;
                }
                while (totaltype > types) {
                    int tempindex = s.charAt(left++) - 'a';
                    count[tempindex]--;
                    if (count[tempindex] == 0) {
                        totaltype--;
                    }
                    if (count[tempindex] == k - 1) {
                        sumtypes--;
                    }
                }
                if (totaltype == sumtypes) {
                    max = Math.max(max, right - left + 1);
                }
                right++;
            }
        }
        return max;
    }
}

public class HW395 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestSubstring("aaabb", 3));
        System.out.println(solution.longestSubstring("ababbc", 2));
        System.out.println(solution.longestSubstring("aaaaaaaaabbbcccccddddd", 5));
    }
}
