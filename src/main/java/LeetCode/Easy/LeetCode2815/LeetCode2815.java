package LeetCode.Easy.LeetCode2815;

import java.util.*;

/**
 * @ClassName LeetCode2815
 * @Description TODO
 * @Author point
 * @Date 2023/9/19 22:38
 * @Version 1.0
 */
class Solution {
    int getHigh(int n) {
        String str = String.valueOf(n);
        int size = str.length();
        int max = 0;
        for (int i = 0; i < size; i++) {
            if (str.charAt(i) - '0' > max) {
                max = str.charAt(i) - '0';
            }
        }
        return max;
    }

    public int maxSum(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            int max = getHigh(nums[i]);
            if (map.containsKey(max)) {
                map.get(max).add(nums[i]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                map.put(max,list);
            }
        }

        // 开始计算最大值
        int res = -1;
        for (Integer key : map.keySet()) {
            List<Integer> list = map.get(key);
            if (list.size() <= 1) {

            } else {
                int[] ints = list.stream().mapToInt(Integer::valueOf).toArray();
                Arrays.sort(ints);
                if (res < (ints[list.size() - 1] + ints[list.size() - 2])) {
                    res = ints[list.size() - 1] + ints[list.size() - 2];
                }
            }

        }
        return res;
    }
}

public class LeetCode2815 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.maxSum(new int[]{51, 71, 17, 24, 42});
    }
}
