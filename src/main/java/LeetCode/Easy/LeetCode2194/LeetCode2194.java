package LeetCode.Easy.LeetCode2194;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LeetCode2194
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 18:12
 * @Version 1.0
 */
class Solution {


    public List<String> cellsInRange(String s) {
        char startchar = s.charAt(0);
        char endchar = s.charAt(3);
        int startint = s.charAt(1) - '0';
        int endint = s.charAt(4) - '0';

        List<String> list = new LinkedList<>();
        for (char i = startchar; i <= endchar; i++) {
            List<String> temp = new LinkedList<>();
            for (int j = startint; j <= endint; j++) {
                temp.add(i + String.valueOf(j));
            }
            list.addAll(temp);
        }
        return list;
    }
}

public class LeetCode2194 {
}
