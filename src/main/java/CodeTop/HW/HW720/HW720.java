package CodeTop.HW.HW720;

import java.util.*;

/**
 * @ClassName HW720
 * @Description TODO
 * @Author point
 * @Date 2023/12/24 19:39
 * @Version 1.0
 */
class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words, (o1, o2) -> {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();
            } else {
                // 字典序降序
                return o2.compareTo(o1);
            }
        });

        Set<String> set = new HashSet<>();
        String res = "";
        set.add(res);
        for (String s : words) {
            if (set.contains(s.substring(0, s.length() - 1))) {
                set.add(s);
                res = s;
            }
        }
        return res;
    }
}

public class HW720 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestWord(new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"}));

    }
}
