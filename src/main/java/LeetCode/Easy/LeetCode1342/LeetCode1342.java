package LeetCode.Easy.LeetCode1342;

/**
 * @ClassName LeetCode1342
 * @Description TODO
 * @Author point
 * @Date 2023/9/17 11:07
 * @Version 1.0
 */
class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;

        }
        return steps;

    }
}

public class LeetCode1342 {
}
