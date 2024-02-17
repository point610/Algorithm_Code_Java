package CodeTop.TX.TX242;

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] xiao = new int[26];
        for (char cc : s.toCharArray()) {
            xiao[cc - 'a']++;
        }
        for (char cc : t.toCharArray()) {
            xiao[cc - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (xiao[i] != 0) {
                return false;
            }
        }
        return true;
    }
}

public class TX242 {
}
