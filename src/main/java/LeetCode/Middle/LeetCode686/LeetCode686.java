package LeetCode.Middle.LeetCode686;

class Solution {
    public int repeatedStringMatch(String a, String b) {
        int max = a.length() * 2 + b.length();
        int res = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (stringBuilder.length() < max) {
            stringBuilder.append(a);
            res++;
            if (stringBuilder.indexOf(b) != -1) {
                return res;
            }
        }
        return -1;
    }
}

public class LeetCode686 {
}
