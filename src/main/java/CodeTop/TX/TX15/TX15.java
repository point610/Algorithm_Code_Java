package CodeTop.TX.TX15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        int size = nums.length;
        for (int i = 0; i < size - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = size - 1;
            while (left < right) {
                // 去重
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    list.add(getlist(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                    continue;
                }
                if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return list;
    }

    private List<Integer> getlist(int one, int two, int three) {
        List<Integer> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        return list;
    }
}

public class TX15 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.threeSum(new int[]{0, 0, 0, 0}));
        System.out.println(solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(solution.threeSum(new int[]{0, 1, 1}));
        System.out.println(solution.threeSum(new int[]{0, 0, 0}));
    }
}
