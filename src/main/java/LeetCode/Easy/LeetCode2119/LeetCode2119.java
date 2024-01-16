package LeetCode.Easy.LeetCode2119;

/**
 * @ClassName LeetCode2119
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 19:34
 * @Version 1.0
 */
class Solution {
    public boolean isSameAfterReversals(int num) {
        if (num == 0) {
            return true;
        }
        return num % 10 != 0;
    }
}

public class LeetCode2119 {
}
