package LeetCode.Easy.LeetCode2309;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LeetCode2309
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 11:50
 * @Version 1.0
 */
class Solution {
    public String greatestLetter(String s) {
        int size = s.length();
        List<Character> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            if (s.indexOf((char) (s.charAt(i) + 32)) != -1) {
                list.add((s.charAt(i)));
            }
        }
        // find max
        char max = 'A' - 1;
        for (int i = 0; i < list.size(); i++) {
            max = (char) Math.max(max, list.get(i));
        }
        if (max == 'A' - 1) {
            return "";
        }
        return String.valueOf(max);
    }
}

public class LeetCode2309 {
}
