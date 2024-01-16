package LeetCode.Hard.LeetCode239;

import java.util.LinkedList;

/**
 * @ClassName LeetCode239
 * @Description TODO
 * @Author point
 * @Date 2023/8/4 0:27
 * @Version 1.0
 */
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // head为最大
        LinkedList<Integer> list = new LinkedList<>();
        int size = nums.length;
        // 初始化list k个
        for (int i = 0; i < k; i++) {
            if (list.isEmpty()) {
                list.add(i);
            } else {
                int lastindex = list.getLast();
                while (nums[lastindex] <= nums[i]) {
                    list.removeLast();
                    if (list.isEmpty()) {
                        break;
                    }
                    lastindex = list.getLast();
                }
                list.add(i);
            }
        }

        int[] res = new int[size - k + 1];
        res[0] = nums[list.getFirst()];

        for (int i = 1; i < size - k + 1; i++) {
            // 从i到i+k-1
            int headindex = list.getFirst();
            if (headindex < i) {
                // 过时了
                list.removeFirst();
            }
            // 加新的
            int newindex = i + k - 1;
            if (list.isEmpty()) {
                // 为空，直接加
                list.add(newindex);
            } else {
                // 不为空，需要比较
                int lastindex = list.getLast();
                // 去掉在该区间内比新的小的index
                while (nums[lastindex] <= nums[newindex]) {
                    list.removeLast();
                    if (list.isEmpty()) {
                        break;
                    }
                    lastindex = list.getLast();
                }
                list.add(newindex);
            }
            headindex = list.getFirst();
            res[i] = nums[headindex];
        }


        return res;
    }
}

public class LeetCode239 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3);
    }
}
