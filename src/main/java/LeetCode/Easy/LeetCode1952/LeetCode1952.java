package LeetCode.Easy.LeetCode1952;

/**
 * @ClassName LeetCode1952
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 17:27
 * @Version 1.0
 */
class Solution {
    public boolean isThree(int n) {
        int one = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                one++;
            }
        }
        return one == 1;
    }
}

public class LeetCode1952 {
}
