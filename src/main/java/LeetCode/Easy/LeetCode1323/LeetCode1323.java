package LeetCode.Easy.LeetCode1323;

/**
 * @ClassName LeetCode1323
 * @Description TODO
 * @Author point
 * @Date 2023/9/17 10:09
 * @Version 1.0
 */
class Solution {
    public int maximum69Number(int num) {
        String s = String.valueOf(num);
        int index = s.indexOf('6');
        if (index == -1) {
            return num;
        }
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.replace(index, index + 1, "9");
        return Integer.parseInt(String.valueOf(stringBuilder));

    }
}

public class LeetCode1323 {
}
