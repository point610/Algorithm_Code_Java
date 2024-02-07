package CodeTop.HW.HW301;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new LinkedList<>();
        Set<String> current = new HashSet<>();
        current.add(s);
        while (true) {
            for (String one : current) {
                // 判断是否为有效的括号的字符串
                if (is(one)) {
                    ans.add(one);
                }
            }

            // 当找到答案时，直接返回
            // 需要返回最小修改的字符串
            if (ans.size() > 0) {
                return ans;
            }

            // 需要对原有的字符串进行修改
            Set<String> next = new HashSet<>();
            // 遍历集合中的所有字符串
            for (String one : current) {
                // 遍历整个字符串
                for (int i = 0; i < one.length(); i++) {
                    // 去除掉相邻相同的字符
                    if (i > 0 && one.charAt(i) == one.charAt(i - 1)) {
                        continue;
                    }
                    // 将遍历到的括号字符去掉，没有特别的算法
                    if (one.charAt(i) == ')' || one.charAt(i) == '(') {
                        next.add(one.substring(0, i) + one.substring(i + 1));
                    }
                }
            }

            // 将修改之后的集合赋值为current，继续处理
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

public class HW301 {
}
