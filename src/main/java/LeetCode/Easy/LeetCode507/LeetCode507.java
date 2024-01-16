package LeetCode.Easy.LeetCode507;

/**
 * @ClassName LeetCode507
 * @Description TODO
 * @Author point
 * @Date 2023/8/9 22:06
 * @Version 1.0
 */
class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}

public class LeetCode507 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.checkPerfectNumber(28));
    }
}
