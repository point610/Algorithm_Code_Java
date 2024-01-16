package LeetCode.Middle.LeetCode93;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode93
 * @Description TODO
 * @Author point
 * @Date 2023/10/30 23:39
 * @Version 1.0
 */
class Solution {
    List<String> list = new ArrayList<>();

    List<String> temp = new ArrayList<>();

    void DFS(String s, int start) {
        // 到了四个字段
        if (temp.size() == 4) {
            if (start == s.length()) {
                list.add(String.join(".", temp));
            }
            return;
        }

        // 遍历当前起点的三个字符
        for (int i = start; i < s.length() && i < start + 3; i++) {
            // 防止含有前导0
            if (s.charAt(start) == '0' && i > start) {
                return;
            }
            Integer integer = Integer.parseInt(s.substring(start, i + 1));
            if (0 <= integer && integer <= 255) {
                temp.add(s.substring(start, i + 1));
                DFS(s, i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public List<String> restoreIpAddresses(String s) {
        DFS(s, 0);
        return list;
    }
}

public class LeetCode93 {
}
