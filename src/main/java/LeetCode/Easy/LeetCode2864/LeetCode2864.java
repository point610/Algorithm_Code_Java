package LeetCode.Easy.LeetCode2864;

/**
 * @ClassName LeetCode2864
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 14:10
 * @Version 1.0
 */
class Solution {
    public String maximumOddBinaryNumber(String s) {
        int size = s.length();
        int onenumber = 0;
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == '1') {
                onenumber++;
            }
        }
        return getMaxNumber(size, onenumber - 1);
    }

    private String getMaxNumber(int size, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append('1');
        }
        for (int i = n; i < size - 1; i++) {
            stringBuilder.append('0');
        }
        stringBuilder.append('1');
        return stringBuilder.toString();
    }
}

public class LeetCode2864 {
}
