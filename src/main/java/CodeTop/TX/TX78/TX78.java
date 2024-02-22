package CodeTop.TX.TX78;

import com.sun.corba.se.impl.ior.FreezableList;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<List<Integer>> list;
    private List<Integer> temp;

    private void DFS(int index, int[] nums) {
        if (index == nums.length) {
            list.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        DFS(index + 1, nums);
        temp.remove(temp.size() - 1);
        DFS(index + 1, nums);
    }

    public List<List<Integer>> subsets(int[] nums) {
        list = new ArrayList<>();
        temp = new ArrayList<>();

        DFS(0, nums);

        return list;
    }
}

public class TX78 {
}
