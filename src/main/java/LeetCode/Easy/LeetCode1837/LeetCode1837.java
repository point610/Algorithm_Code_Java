package LeetCode.Easy.LeetCode1837;

/**
 * @ClassName LeetCode1837
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 0:31
 * @Version 1.0
 */
class Solution {

    public int sumBase(int n, int k) {

        int res = 0;
        while (n != 0) {

            res += n % k;
            n /= k;


        }
        return res;

    }
}

public class LeetCode1837 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.sumBase(10, 10));
    }
}
