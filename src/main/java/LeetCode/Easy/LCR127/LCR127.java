package LeetCode.Easy.LCR127;

/**
 * @ClassName LCR127
 * @Description TODO
 * @Author point
 * @Date 2023/10/8 23:40
 * @Version 1.0
 */
class Solution {
    public int trainWays(int num) {
        int one = 1;
        int two = 2;
        if (num == 0) {
            return 1;
        }
        if (num == 1) {
            return 1;
        }
        for (int i = 3; i <= num; i++) {
            int sum = (one + two) % 1000000007;
            one = two;
            two = sum;
        }
        return two;
    }
}

public class LCR127 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.trainWays(5));
    }
}
