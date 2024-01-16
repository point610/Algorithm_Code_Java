package LeetCode.Easy.LeetCode1773;

import java.util.List;

/**
 * @ClassName LeetCode1773
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 18:35
 * @Version 1.0
 */
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int resnumber = 0;
        int size = items.size();
        if ("type".equals(ruleKey)) {
            for (int i = 0; i < size; i++) {
                if (items.get(i).get(0).equals(ruleValue)) {
                    resnumber++;
                }
            }
        } else if (ruleKey.equals("color")) {
            for (int i = 0; i < size; i++) {
                if (items.get(i).get(1).equals(ruleValue)) {
                    resnumber++;
                }
            }
        } else if (ruleKey.equals("name")) {
            for (int i = 0; i < size; i++) {
                if (items.get(i).get(2).equals(ruleValue)) {
                    resnumber++;
                }
            }
        }
        return resnumber;
    }
}

public class LeetCode1773 {
}
