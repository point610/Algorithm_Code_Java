package LeetCode.Easy.LeetCode2068;

/**
 * @ClassName LeetCode2068
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 12:12
 * @Version 1.0
 */
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] list = new int[26];
        int size = word1.length();
        for (int i = 0; i < size; i++) {
            list[word1.charAt(i) - 'a']++;
            list[word2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (Math.abs(list[i]) > 3) {
                return false;
            }
        }
        return true;
    }
}

public class LeetCode2068 {
}
