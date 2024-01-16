package LeetCode.Hard.LeetCode301;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @ClassName LeetCode301
 * @Description TODO
 * @Author point
 * @Date 2023/11/29 22:39
 * @Version 1.0
 */
class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new LinkedList<>();
        Set<String> current = new HashSet<>();
        current.add(s);
        while (true) {
            for (String one : current) {
                if (is(one)) {
                    ans.add(one);
                }
            }
            if (ans.size() > 0) {
                return ans;
            }
            Set<String> next = new HashSet<>();
            for (String one : current) {
                for (int i = 0; i < one.length(); i++) {
                    if (i > 0 && one.charAt(i) == one.charAt(i - 1)) {
                        continue;
                    }
                    if (one.charAt(i) == ')' || one.charAt(i) == '(') {
                        next.add(one.substring(0, i) + one.substring(i + 1));
                    }
                }

            }
            current = next;
        }
    }

    private boolean is(String one) {
        int count = 0;
        int size = one.length();
        for (int i = 0; i < size; i++) {
            if (one.charAt(i) == '(') {
                count++;
            } else if (one.charAt(i) == ')') {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }

}

public class LeetCode301 {
}

