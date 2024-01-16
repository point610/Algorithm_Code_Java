package LeetCode.Easy.LeetCode482;

/**
 * @ClassName LeetCode482
 * @Description TODO
 * @Author point
 * @Date 2023/7/28 1:15
 * @Version 1.0
 */
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String temp = s.replaceAll("-", "");
        if (temp.length() <= k) {
            return temp.toUpperCase();
        }
        StringBuilder stringBuilder = new StringBuilder(temp.toUpperCase());
        // stringBuilder.reverse();
        int size = stringBuilder.length();
        System.out.println(stringBuilder);
        for (int i = size - k; i > 0; i -= k) {
            stringBuilder.insert(i, "-");
        }
        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }


}

public class LeetCode482 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }
}
