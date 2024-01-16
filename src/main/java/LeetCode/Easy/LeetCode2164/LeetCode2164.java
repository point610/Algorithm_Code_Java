package LeetCode.Easy.LeetCode2164;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName v
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 22:53
 * @Version 1.0
 */
class Solution {
    public int[] sortEvenOdd(int[] nums) {

        List<Integer> one = new LinkedList<>();
        List<Integer> two = new LinkedList<>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                one.add(nums[i]);
            } else {
                two.add(nums[i]);
            }
        }
        // order
        Collections.sort(one);
        Collections.sort(two, (o1, o2) -> o2 - o1);

        int oneindex = 0;
        int twoindex = 0;
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                nums[i] = one.get(oneindex++);
            } else {
                nums[i] = two.get(twoindex++);
            }
        }
return nums;
    }
}

public class LeetCode2164 {
}
