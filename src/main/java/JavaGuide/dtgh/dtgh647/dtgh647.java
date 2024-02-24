package JavaGuide.dtgh.dtgh647;

class Solution {
    public int countSubstrings(String s) {
        int size = s.length();
        int res = 0;
        for (int mid = 0; mid < 2 * size - 1; mid++) {
            int left = mid / 2;
            int right = mid / 2 + mid % 2;

            while (0 <= left && right < size && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
                res++;
            }

        }
        return res;
    }
}

public class dtgh647 {
}
