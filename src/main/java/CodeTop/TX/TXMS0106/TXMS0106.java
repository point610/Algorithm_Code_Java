package CodeTop.TX.TXMS0106;

class Solution {
    public String compressString(String S) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            char cc = S.charAt(i);
            int tiems = 0;
            while (i < S.length() && S.charAt(i) == cc) {
                tiems++;
                i++;
            }
            i--;
            stringBuilder.append(cc);
            stringBuilder.append(tiems);
        }
        if (stringBuilder.length() < S.length()) {
            return stringBuilder.toString();
        }

        return S;
    }
}

public class TXMS0106 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.compressString("aabcccccaaa"));
        System.out.println(solution.compressString("abbccd"));
    }
}
