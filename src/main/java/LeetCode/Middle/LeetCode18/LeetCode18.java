package LeetCode.Middle.LeetCode18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName LeetCode18
 * @Description TODO
 * @Author point
 * @Date 2023/7/15 23:08
 * @Version 1.0
 */
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> rse = new ArrayList<>();
        // 排序
        int size = nums.length;
        if (nums == null || size < 4) {
            return rse;
        }
        Arrays.sort(nums);

        // for (int i = 0; i < size; i++) {
        //     System.out.println(nums[i]);
        // }
        // 遍历前两个数
        for (int i = 0; i < size - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < size - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                // 使用双指针遍历后两个元素
                int one = j + 1;
                int two = size - 1;
                while (one < two) {
                    long sum =(long) nums[i] + nums[j] + nums[one] + nums[two];
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[one]);
                        temp.add(nums[two]);
                        rse.add(temp);
                        // 移动one和two
                        while (one < two && nums[one] == nums[one + 1]) {
                            one++;
                        }
                        one++;
                        while (one < two && nums[two] == nums[two - 1]) {
                            two--;
                        }
                        two--;
                    } else if (sum < target) {
                        one++;
                    } else {
                        two--;
                    }

                }
            }
        }
        return rse;
    }
}

public class LeetCode18 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296);
        for (int i = 0; i < lists.size(); i++) {
            for (int j = 0; j < lists.get(i).size(); j++) {
                System.out.print(lists.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
