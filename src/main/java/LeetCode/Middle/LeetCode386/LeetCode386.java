package LeetCode.Middle.LeetCode386;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
    List<Integer> list = new ArrayList<>();

    public List<Integer> lexicalOrder(int n) {

        for (int i = 1; i <= 9; i++) {
            dfs(i, n);
        }

        return list;
    }

    private void dfs(int cur, int n) {
        if (cur > n) {
            return;
        }
        list.add(cur);
        for (int i = 1; i <= 9; i++) {
            dfs(cur * 10 + i, n);
        }
    }
}

public class LeetCode386 {
}
