package LeetCode.Easy.LeetCode3110;

class Solution {
    public int scoreOfString(String s) {
        int res = 0;

        char[] list = s.toCharArray();
        for (int i = 0; i < list.length - 1; i++) {
            res += Math.abs(list[i] - list[i + 1]);
        }

        return res;
    }
}

public class LeetCode3110 {
}
