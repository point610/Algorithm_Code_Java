package CodeTop.HW.HW22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    private List<String> list = new ArrayList<>();
    private Set<String> set = new HashSet<>();

    private void DFS(int left, int right, int sum, String ss) {
        if (right == sum) {
            if (!set.contains(ss)) {
                set.add(ss);
                list.add(ss);
            }
            return;
        }

        if (left == sum) {
            DFS(left, right + 1, sum, ss + ')');
            return;
        }
        if (left == right) {
            DFS(left + 1, right, sum, ss + '(');
        }
        DFS(left + 1, right, sum, ss + '(');
        if (left > right) {
            DFS(left, right + 1, sum, ss + ')');
        }
    }

    public List<String> generateParenthesis(int n) {
        list = new ArrayList<>();
        set = new HashSet<>();
        DFS(0, 0, n, "");
        return list;
    }
}

public class HW22 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generateParenthesis(3));
        System.out.println(solution.generateParenthesis(1));
    }
}
