package LeetCode.Easy.LeetCode2788;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LeetCode2788
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 13:58
 * @Version 1.0
 */
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        int size = words.size();
        List<String> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            String[] split = words.get(i).split("[" + separator + "]");
            // String[] split = words.get(i).split("$");
            for (int j = 0; j < split.length; j++) {
                if (split[j].isEmpty()) {
                    continue;
                }
                list.add(split[j]);
            }
        }
        return list;
    }
}

public class LeetCode2788 {
    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.splitWordsBySeparator(Arrays.asList(new String[]{"$easy$", "$problem$"}), '$');
    }
}
