package LeetCode.Easy.LeetCode1071;

/**
 * @ClassName LeetCode1071
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 16:56
 * @Version 1.0
 */
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!str1.concat(str2).equals(str2.concat(str1))) {
            return "";
        }
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    private int gcd(int one, int two) {
        int min = Math.min(one, two);
        int max = Math.max(one, two);
        one = min;
        two = max;
        for (int i = one; i >= 1; i--) {
            if (two % i == 0 && one % i == 0) {
                return i;
            }
        }
        return 1;
    }
}

public class LeetCode1071 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.gcdOfStrings("LEET", "CODE"));
    }
}
