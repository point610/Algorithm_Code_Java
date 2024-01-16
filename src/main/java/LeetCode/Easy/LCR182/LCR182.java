package LeetCode.Easy.LCR182;

/**
 * @ClassName LCR182
 * @Description TODO
 * @Author point
 * @Date 2023/10/9 23:32
 * @Version 1.0
 */
class Solution {
    public String dynamicPassword(String password, int target) {
        return password.substring(target) + password.substring(0, target);
    }
}

public class LCR182 {
}
