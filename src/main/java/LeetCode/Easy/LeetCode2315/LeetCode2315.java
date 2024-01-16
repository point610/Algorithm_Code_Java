package LeetCode.Easy.LeetCode2315;

/**
 * @ClassName LeetCode2315
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 13:04
 * @Version 1.0
 */
class Solution {
    public int countAsterisks(String s) {
        int sum = 0;
        int size = s.length();
        boolean in = false;
        for (int i = 0; i < size; i++) {
            if (!in) {
                if (s.charAt(i) == '*') {
                    sum++;
                }
                if (s.charAt(i) == '|') {
                    in = true;
                }

            } else {
                if (s.charAt(i) == '|') {
                    in = false;
                }
            }
        }
        return sum;
    }
}

public class LeetCode2315 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countAsterisks("yo|uar|e**|b|e***au|tifu|l"));
    }
}
