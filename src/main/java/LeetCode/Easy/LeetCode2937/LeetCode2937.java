package LeetCode.Easy.LeetCode2937;

/**
 * @ClassName LeetCode2937
 * @Description TODO
 * @Author point
 * @Date 2024/1/16 23:17
 * @Version 1.0
 */
class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {

        int index = 0;
        while (index < s1.length() && index < s2.length() && index < s3.length()) {
            char aaa = s1.charAt(index);
            char bbb = s2.charAt(index);
            char ccc = s3.charAt(index);
            if (aaa == bbb && aaa == ccc) {
                index++;
            } else {
                break;
            }
        }
        if (index != 0) {
            return s1.length() + s2.length() + s3.length() - 3 * index;
        }
        return -1;
    }
}

public class LeetCode2937 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findMinimumOperations("abc", "abb", "ab"));
        System.out.println(solution.findMinimumOperations("dac", "bac", "cac"));
        System.out.println(solution.findMinimumOperations("a", "aabc", "a"));
        System.out.println(solution.findMinimumOperations("ca", "cccabb", "cb"));
    }
}
