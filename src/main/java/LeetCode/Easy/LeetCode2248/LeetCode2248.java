package LeetCode.Easy.LeetCode2248;

import java.util.*;

/**
 * @ClassName LeetCode2248
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 23:49
 * @Version 1.0
 */
class Solution {
    public List<Integer> intersection(int[][] nums) {
        int size = nums.length;
        Set<Integer>[] sets = new Set[size];
        for (int i = 0; i < size; i++) {
            sets[i] = new HashSet<>();
            int tempsize = nums[i].length;
            for (int j = 0; j < tempsize; j++) {
                sets[i].add(nums[i][j]);
            }
        }
        Set<Integer> res = new HashSet<>();
        res.addAll(sets[0]);
        for (int i = 1; i < size; i++) {
            res.retainAll(sets[i]);
        }
        List<Integer> list = new LinkedList<>();
        Iterator<Integer> iterator = res.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        Collections.sort(list);
return list;

    }
}

public class LeetCode2248 {
}
