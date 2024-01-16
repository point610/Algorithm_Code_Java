package LeetCode.Middle.LeetCode77;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode77
 * @Description TODO
 * @Author point
 * @Date 2023/10/26 22:59
 * @Version 1.0
 */
class Solution {
    List<List<Integer>> list = new ArrayList<>();

    void DFS(int n, int index, int k, List<Integer> temp) {
        if (index > n) {
            return;
        } if (temp.size() == k) {
            list.add(new ArrayList<>(temp));
            return;
        }



        index++;

        temp.add(index);
        DFS(n, index, k, temp);
        temp.remove(temp.size() - 1);

        DFS(n, index, k, temp);

    }

    public List<List<Integer>> combine(int n, int k) {
        DFS(n, 0, k, new ArrayList<>());
        return list;
    }
}

public class LeetCode77 {
}
