package LeetCode.Middle.LeetCode131;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode131
 * @Description TODO
 * @Author point
 * @Date 2023/11/7 23:30
 * @Version 1.0
 */
class Solution {
    List<List<String>> list = new ArrayList<>();

    List<String> templist = new ArrayList<>();

    boolean huiwen(String s) {
        int size = s.length();
        for (int i = 0; i < size / 2; i++) {
            if (s.charAt(i) != s.charAt(size - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    void DFS(String s) {
        if (s.length() == 0) {
            list.add(new ArrayList<>(templist));
            return;
        }
        int size = s.length();
        for (int i = 0; i < size; i++) {
            String temp = s.substring(0, i + 1);
            if (huiwen(temp)) {
                templist.add(temp);
                DFS(s.substring(i + 1));
                templist.remove(templist.size() - 1);
            }
        }

    }

    public List<List<String>> partition(String s) {

DFS(s);
        return list;
    }
}

public class LeetCode131 {
}
