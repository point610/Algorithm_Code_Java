package CodeTop.TX.TX46;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<List<Integer>> list;

    private void DFS(List<Integer> temp, int index) {
        if (temp.size() - 1 == index) {
            list.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < temp.size(); i++) {
            // 交换位置
            int iii = temp.get(i);
            temp.set(i, temp.get(index));
            temp.set(index, iii);

            DFS(temp, index + 1);

            // 交换位置
            iii = temp.get(i);
            temp.set(i, temp.get(index));
            temp.set(index, iii);

        }

    }

    public List<List<Integer>> permute(int[] nums) {
        list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int ii : nums) {
            temp.add(ii);
        }

        DFS(temp, 0);

        return list;
    }
}

public class TX46 {
}
