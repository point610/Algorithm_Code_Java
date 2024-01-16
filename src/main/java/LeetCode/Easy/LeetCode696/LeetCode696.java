package LeetCode.Easy.LeetCode696;


/**
 * @ClassName LeetCode696
 * @Description TODO
 * @Author point
 * @Date 2023/8/10 17:57
 * @Version 1.0
 */
    class Solution {
        public int countBinarySubstrings(String s) {
            int res = 0;
            int point = 0;
            int size = s.length();
            int before = 0;
            while (point < size) {
                int number = 0;
                int temp = point;
                while (temp < size && s.charAt(point) == s.charAt(temp)) {
                    temp++;
                    number++;
                }

                res += Math.min(before, number);
                before = number;
                point = temp;
            }
            return res;
        }
    }

public class LeetCode696 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countBinarySubstrings("10101"));
    }
}
