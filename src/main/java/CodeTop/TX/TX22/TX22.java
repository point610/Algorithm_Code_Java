package CodeTop.TX.TX22;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<String> list;

    private void DFS(String s, int left, int right) {
        if (left == 0 & right == 0) {
            list.add(s);
            return;
        }
        if (left == right) {
            DFS(s + '(', left - 1, right);
        } else if (left < right) {
            // 在s中，左的比右的多
            // 这里的left指的是剩余的

            // 存在两种情况
            if (left > 0) {
                DFS(s + '(', left - 1, right);
            }
            DFS(s + ')', left, right - 1);
        }
        // 当剩余的right比left少时，是错误的
    }

    public List<String> generateParenthesis(int n) {
        list = new ArrayList<>();
        if (n <= 0) {
            return list;
        }

        DFS("", n, n);

        return list;
    }
}

public class TX22 {
}
