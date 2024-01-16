package LeetCode.Easy.LeetCode1812;

/**
 * @ClassName LeetCode1812
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 19:43
 * @Version 1.0
 */
class Solution {
    public boolean squareIsWhite(String coordinates) {
        int sum = coordinates.charAt(0) - '0' + coordinates.charAt(1) - 'a' + 1;
        return sum % 2 == 1;

    }
}

public class LeetCode1812 {
}
