package LeetCode.Easy.LeetCode;

/**
 * @ClassName LeetCode
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 23:53
 * @Version 1.0
 */
class Solution {
    public String thousandSeparator(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        int times = 0;
        while (n != 0) {
            stringBuilder.append(String.valueOf(n % 10));
            n /= 10;
            times++;
            if (n != 0 && times % 3 == 0) {
                stringBuilder.append('.');
            }
        }
        return stringBuilder.reverse().toString();
    }
}

public class LeetCode {
}
