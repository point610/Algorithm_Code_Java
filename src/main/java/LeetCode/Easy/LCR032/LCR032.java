package LeetCode.Easy.LCR032;

/**
 * @ClassName LCR032
 * @Description TODO
 * @Author point
 * @Date 2023/10/7 21:50
 * @Version 1.0
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.equals(t) || s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];
        int size = s.length();
        for (int i = 0; i < size; i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < size; i++) {
            arr[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;

    }
}

public class LCR032 {
}
