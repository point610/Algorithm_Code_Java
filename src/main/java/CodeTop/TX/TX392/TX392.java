package CodeTop.TX.TX392;

class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.equals("")) {
            return true;
        }
        int ssize = s.length();
        int tsize = t.length();
        if (ssize > tsize) {
            return false;
        }

        int sindex = 0;
        for (int i = 0; i < tsize; i++) {
            if (s.charAt(sindex) == t.charAt(i)) {
                sindex++;
            }

            if (sindex >= ssize) {
                return true;
            }
        }
        return false;
    }
}

public class TX392 {
}
