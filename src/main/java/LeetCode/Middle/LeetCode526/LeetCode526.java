package LeetCode.Middle.LeetCode526;

import com.sun.jmx.remote.internal.ClientListenerInfo;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<Integer> temp;
    private int res;
    private List<List<Integer>> lll = new ArrayList<>();

    public int countArrangement(int n) {
        temp = new ArrayList<>();
        res = 0;
        for (int i = 0; i <= n; i++) {
            temp.add(i);
        }
        dfs(1);

        return res;
    }

    private void dfs(int index) {
        if (index == temp.size()) {
            lll.add(new ArrayList<>(temp));
            res++;
            return;
        }

        for (int i = index; i < temp.size(); i++) {
            int tt = temp.get(i);
            temp.set(i, temp.get(index));
            temp.set(index, tt);

            if (check(index, temp.get(index))) {
                dfs(index + 1);
            }

            tt = temp.get(i);
            temp.set(i, temp.get(index));
            temp.set(index, tt);
        }
    }

    private boolean check(int index, int one) {
        return one % index == 0 || index % one == 0;
    }
}

public class LeetCode526 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countArrangement(2));
        System.out.println(solution.countArrangement(1));
    }
}

























