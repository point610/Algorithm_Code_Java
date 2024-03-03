package CodeTop.HW2.HW383;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] one = getlist(ransomNote);
        int[] two = getlist(magazine);
        for (int i = 0; i < 26; i++) {
            if (one[i] > two[i]) {
                return false;
            }
        }
        return true;
    }

    private int[] getlist(String one) {
        int[] list = new int[26];
        for (int i = 0; i < one.length(); i++) {
            list[one.charAt(i) - 'a']++;
        }
        return list;
    }
}

public class HW383 {
}
