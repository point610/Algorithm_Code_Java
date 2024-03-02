package CodeTop.HW2.HW1160;

class Solution {
    private int[] one;

    public int countCharacters(String[] words, String chars) {
        initial(chars);
        int res = 0;

        for (String word : words) {
            if (can(word)) {
                res+=word.length();
            }
        }

        return res;
    }

    private boolean can(String sss) {
        int[] temp = getlist(sss);
        for (int i = 0; i < 26; i++) {
            if (one[i] < temp[i]) {
                return false;
            }
        }
        return true;
    }

    private int[] getlist(String sss) {
        int[] temp = new int[26];

        for (int i = 0; i < sss.length(); i++) {
            temp[sss.charAt(i) - 'a']++;
        }

        return temp;
    }

    private void initial(String sss) {
        one = getlist(sss);
    }
}

public class HW1160 {
}
