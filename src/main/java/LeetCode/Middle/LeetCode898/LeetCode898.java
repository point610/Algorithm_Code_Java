package LeetCode.Middle.LeetCode898;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> res = new HashSet<>();
        Set<Integer> pre = new HashSet<>();

        for (int one : arr) {
            Set<Integer> temp = new HashSet<>();

            for (Integer integer : pre) {
                temp.add(integer | one);
            }

            temp.add(one);

            res.addAll(temp);
            pre = temp;
        }

        return res.size();
    }
}

public class LeetCode898 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.subarrayBitwiseORs(new int[]{0}));
        System.out.println(solution.subarrayBitwiseORs(new int[]{1, 1, 2}));

    }
}
