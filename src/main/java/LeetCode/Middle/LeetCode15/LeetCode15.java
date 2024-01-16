package LeetCode.Middle.LeetCode15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName LeetCode15
 * @Description TODO
 * @Author point
 * @Date 2023/7/15 23:36
 * @Version 1.0
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int size = nums.length;
        if (nums == null || size < 3) {
            return res;
        }
        Arrays.sort(nums);
        // for (int i = 0; i < size; i++) {
        //     System.out.println(nums[i]);
        // }
        for (int i = 0; i < size - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int one = i + 1;
            int two = size - 1;
            while (one < two) {
                long sum = (long) nums[i] + nums[one] + nums[two];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[one], nums[two]));
                    while (one < two && nums[one] == nums[one + 1]) {
                        one++;
                    }
                    one++;
                    while (one < two && nums[two] == nums[two - 1]) {
                        two--;
                    }
                    two--;
                } else if (sum < 0) {
                    one++;
                } else {
                    two--;
                }
            }

        }
        return res;

    }
}

public class LeetCode15 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        for (int i = 0; i < lists.size(); i++) {
            for (int j = 0; j < lists.get(i).size(); j++) {
                System.out.print(lists.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
