package LeetCode.Easy.LeetCode929;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode929
 * @Description TODO
 * @Author point
 * @Date 2023/8/13 23:43
 * @Version 1.0
 */
class Solution {
    Map<String, Integer> map = new HashMap<>();

    public int numUniqueEmails(String[] emails) {

        int size = emails.length;
        for (int i = 0; i < size; i++) {
            String current = emails[i];
            StringBuilder stringBuilder = new StringBuilder();
            int curSize = current.length();
            for (int j = 0; j < curSize; j++) {
                if (current.charAt(j) == '+'||current.charAt(j) == '@') {
                    break;
                }
                if (current.charAt(j) == '.') {
                    continue;
                }
                stringBuilder.append(current.charAt(j));
            }
            int Aindex = 0;
            for (int j = 0; j < curSize; j++) {
                if (current.charAt(j) == '@') {
                    Aindex = j;
                    break;
                }
            }
            String res = stringBuilder + current.substring(Aindex);
            map.put(res, map.getOrDefault(res, 0) + 1);
        }


        return map.keySet().size();
    }
}

public class LeetCode929 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numUniqueEmails(new String[]{
                "test.email+alex@leetcode.com",
                "test.email@leetcode.com"}));
    }
}
