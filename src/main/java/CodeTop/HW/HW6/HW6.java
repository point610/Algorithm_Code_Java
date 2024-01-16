package CodeTop.HW.HW6;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName HW6
 * @Description TODO
 * @Author point
 * @Date 2023/12/28 9:39
 * @Version 1.0
 */
class Solution {
    public String convert(String s, int numRows) {
        Map<Integer, StringBuilder> map = new HashMap<>();
        for (int i = 0; i < numRows; i++) {
            map.put(i, new StringBuilder());
        }
        int index = 0;
        boolean up = true;
        for (int i = 0; i < s.length(); i++) {
            map.get(index % numRows).append(s.charAt(i));
            if (up) {
                index++;
                if (index == numRows - 1) {
                    up = false;
                }
            } else {
                index--;
                if (index == 0) {
                    up = true;
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            stringBuilder.append(map.get(i));
        }
        return stringBuilder.toString();
    }
}

public class HW6 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convert("PAYPALISHIRING", 3));
    }
}
