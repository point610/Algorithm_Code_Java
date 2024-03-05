package CodeTop.HW2.HW46;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<List<Integer>> list;
    private List<Integer> temp;

    private void DFS(int index) {
        if (index == temp.size() - 1) {
            list.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < temp.size(); i++) {
            int ll = temp.get(index);
            temp.set(index, temp.get(i));
            temp.set(i, ll);

            // 为index+1
            DFS(index + 1);

            ll = temp.get(index);
            temp.set(index, temp.get(i));
            temp.set(i, ll);
        }

    }

    public List<List<Integer>> permute(int[] nums) {
        list = new ArrayList<>();
        temp = new ArrayList<>();
        for (int num : nums) {
            temp.add(num);
        }

        DFS(0);

        return list;
    }
}

public class HW46 {
}
