package LeetCode.Middle.LeetCode457;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {


    public boolean circularArrayLoop(int[] nums, int index) {

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        while (!set.contains(index)) {
            int step = nums[index];
            set.add(index);
            list.add(index);
            index = (index + nums.length * 1000 + step) % nums.length;

        }

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == index) {
                index = i;
                break;
            }
        }
        for (int i = index; i < list.size(); i++) {
            res.add(nums[list.get(i)]);
        }
        if (res.size() <= 1) {
            return false;
        }
        boolean zhengshu = res.get(0) > 0;
        for (int i = 1; i < res.size(); i++) {
            if (zhengshu) {
                if (res.get(i) < 0) {
                    return false;
                }
            } else {
                if (res.get(i) > 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean circularArrayLoop(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (circularArrayLoop(nums, i)) {
                return true;
            }
        }
        return false;
    }
}

public class LeetCode457 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.circularArrayLoop(new int[]{2, -1, 1, 2, 2}));
        System.out.println(solution.circularArrayLoop(new int[]{-1, 2}));
        System.out.println(solution.circularArrayLoop(new int[]{-2, 1, -1, -2, -2}));
    }
}
