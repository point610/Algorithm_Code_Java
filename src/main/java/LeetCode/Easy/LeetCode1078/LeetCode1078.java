package LeetCode.Easy.LeetCode1078;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode1078
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 17:05
 * @Version 1.0
 */
class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] strings = text.split(" ");
        int size = strings.length;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (strings[i].equals(first)) {
                if (i + 2 >= size) {
                    break;
                }
                if (strings[i + 1].equals(second)) {
                    list.add(strings[i + 2]);
                }
            }
        }
        size = list.size();
        String[] res = new String[size];
        for (int i = 0; i < size; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}

public class LeetCode1078 {
}
