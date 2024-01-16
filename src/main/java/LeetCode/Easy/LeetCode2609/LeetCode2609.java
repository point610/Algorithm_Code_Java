package LeetCode.Easy.LeetCode2609;

/**
 * @ClassName LeetCode2609
 * @Description TODO
 * @Author point
 * @Date 2023/10/3 12:13
 * @Version 1.0
 */
class Solution {
    boolean ispingheng(String s) {
        int size = s.length();
        if (size % 2 != 0) {
            return false;
        }
        for (int i = 0, j = size / 2; i < size / 2; i++, j++) {
            if (s.charAt(i) == '1') {
                return false;
            }
            if (s.charAt(j) == '0') {
                return false;
            }
        }
        return true;
    }

    public int findTheLongestBalancedSubstring(String s) {
        int size = s.length();
        int maxlength = 0;
        for (int i = 0; i < size; i++) {
            for (int j = size; j >= i; j--) {
                if ((j - i) % 2 == 0) {
                    if (ispingheng(s.substring(i, j))) {
                        maxlength = Math.max(maxlength, j - i);
                    }
                }
            }
        }
        return maxlength;
    }
}

public class LeetCode2609 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findTheLongestBalancedSubstring("111"));
    }
}
