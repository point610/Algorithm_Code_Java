package LeetCode.Easy.LeetCode1974;

/**
 * @ClassName LeetCode1974
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 0:41
 * @Version 1.0
 */
class Solution {
    public int minTimeToType(String word) {
        int sum = 0;
        int size = word.length();

        int step = Math.abs(word.charAt(0) - 'a');
        sum += Math.min(step, 26 - step);

        for (int i = 1; i < size; i++) {
            step = Math.abs(word.charAt(i - 1) - word.charAt(i));
            sum += Math.min(step, 26 - step);
        }
        return sum + size;

    }
}

public class LeetCode1974 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minTimeToType("bza"));
    }
}
