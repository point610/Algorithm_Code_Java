package LeetCode.Middle.LeetCode166;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode166
 * @Description TODO
 * @Author point
 * @Date 2023/11/12 22:56
 * @Version 1.0
 */
class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        // 转化为long，防止溢出
        long one = numerator;
        long two = denominator;

        // 若能够整除，直接返回
        if (one % two == 0) {
            return String.valueOf(one / two);
        }
        StringBuilder stringBuilder = new StringBuilder();
        // 判断是否为负数
        if (one * two < 0) {
            stringBuilder.append('-');
        }
        one = Math.abs(one);
        two = Math.abs(two);

        // 保留正数部分
        stringBuilder.append(String.valueOf(one / two) + '.');
        one %= two;
        // 使用map来记录出现的余数
        Map<Long, Integer> map = new HashMap<>();
        while (one != 0) {
            map.put(one, stringBuilder.length());
            // 模拟除法的操作
            one *= 10;
            stringBuilder.append(one / two);
            one %= two;
            // 若出现余数相同，则出现循环的小数部分
            if (map.containsKey(one)) {
                // 出现循环的地方
                int index = map.get(one);
                return String.format("%s(%s)", stringBuilder.substring(0, index), stringBuilder.substring(index));
            }

        }
        return stringBuilder.toString();
    }
}

public class LeetCode166 {
}
