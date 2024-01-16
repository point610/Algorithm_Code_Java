package CodeTop.HW.HW658;

import java.util.*;

/**
 * @ClassName HW658
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 10:50
 * @Version 1.0
 */
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        for (int ii : arr) {
            list.add(ii);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o1 - x) - Math.abs(o2 - x);
            }
        });
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(list.get(i));
        }
        Collections.sort(res);
        return res;
    }
}

public class HW658 {
}
