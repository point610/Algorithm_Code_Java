package CodeTop.HW.HW93;

import com.sun.deploy.util.StringUtils;
import jdk.internal.org.objectweb.asm.ClassReader;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<String> temp;
    private List<String> list;

    private void DFS(String s, int start) {
        if (temp.size() == 4) {
            // 确保数量为4时，正好完全的覆盖字符串
            if (start == s.length()) {
                list.add(String.join(".", temp));
            }
            return;
        }

        for (int i = start; i < start + 3 && i < s.length(); i++) {

            // 去除前导0的情况
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
        temp = new ArrayList<>();
        list = new ArrayList<>();

        DFS(s, 0);

        return list;
    }
}

public class HW93 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.restoreIpAddresses("25525511135"));
        System.out.println(solution.restoreIpAddresses("0000"));
        System.out.println(solution.restoreIpAddresses("101023"));
    }
}
