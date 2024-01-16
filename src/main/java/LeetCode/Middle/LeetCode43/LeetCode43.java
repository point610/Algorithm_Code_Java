package LeetCode.Middle.LeetCode43;

import java.math.BigInteger;

/**
 * @ClassName LeetCode43
 * @Description TODO
 * @Author point
 * @Date 2023/10/23 23:41
 * @Version 1.0
 */
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger one = new BigInteger(num1);
        BigInteger two = new BigInteger(num2);
        return String.valueOf(one.multiply(two));
    }
}

public class LeetCode43 {
}
