package CodeTop.TX.TX93;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<String> list;
    // 记录分段的字符串
    private List<String> temp;

    private void DFS(String s, int start) {
        if (temp.size() == 4) {
            if (start == s.length()) {
                // 符合
                // 调用方法进行整合
                list.add(String.join(".", temp));
            }
            return;
        }

        // 使用for循环进行递归
        for (int i = start; i < s.length() && i < start + 3; i++) {
            // 防止前导零
            // 注意是start
            if (i > start && s.charAt(start) == '0') {
                return;
            }
            Integer integer = Integer.valueOf(s.substring(start, i + 1));
            if (0 <= integer && integer <= 255) {
                temp.add(s.substring(start, i + 1));
                DFS(s, i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public List<String> restoreIpAddresses(String s) {
        list = new ArrayList<>();
        temp = new ArrayList<>();

        DFS(s, 0);

        return list;
    }
}

public class TX93 {
}
