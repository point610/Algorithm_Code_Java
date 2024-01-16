package LeetCode.Easy.LeetCode1909;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LeetCode1909
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 11:49
 * @Version 1.0
 */
class Solution {
    boolean isup(List<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean canBeIncreasing(int[] nums) {
        List<Integer> list = new LinkedList<>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            list.add(nums[i]);
        }
        if (isup(list)){
            return true;
        }
        for (int i = 0; i < size - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                List<Integer> temp = new LinkedList<>(list);
                temp.remove(i);
                list.remove(i + 1);
                if (isup(temp) || isup(list)) {
                    return true;
                }
                break;
            }
        }
        return false;

    }
}

public class LeetCode1909 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canBeIncreasing(new int[]{1, 2, 10, 5, 7}));
        System.out.println(solution.canBeIncreasing(new int[]{105, 924, 32, 968}));
    }
}
