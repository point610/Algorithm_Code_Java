package CodeTop.HW.HW784;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName HW784
 * @Description TODO
 * @Author point
 * @Date 2023/12/24 17:23
 * @Version 1.0
 */
class Solution {
    List<String> list = new ArrayList<>();

    void DFS(StringBuilder stringBuilder, int index) {
        if (index == stringBuilder.length()) {
            list.add(new String(stringBuilder));
            return;
        }
        if (Character.isLowerCase(stringBuilder.charAt(index))) {
            DFS(stringBuilder, index + 1);
            stringBuilder.setCharAt(index, Character.toUpperCase(stringBuilder.charAt(index)));
            DFS(stringBuilder, index + 1);
            stringBuilder.setCharAt(index, Character.toLowerCase(stringBuilder.charAt(index)));
        } else if (Character.isUpperCase(stringBuilder.charAt(index))) {
            DFS(stringBuilder, index + 1);
            stringBuilder.setCharAt(index, Character.toLowerCase(stringBuilder.charAt(index)));
            DFS(stringBuilder, index + 1);
            stringBuilder.setCharAt(index, Character.toUpperCase(stringBuilder.charAt(index)));
        } else {
            DFS(stringBuilder, index + 1);
        }
    }

    public List<String> letterCasePermutation(String s) {
        DFS(new StringBuilder(s), 0);
        return list;
    }
}

public class HW784 {
}
