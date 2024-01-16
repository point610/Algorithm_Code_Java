package LeetCode.Easy.LeetCode2200;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LeetCode2200
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 12:01
 * @Version 1.0
 */
class Solution {
    List<Integer> list = new LinkedList<>();

    int index = 0;

    void putlist(int[] nums, int startindex, int endindex) {
        startindex = Math.max(startindex, 0);
        int size = nums.length;
        if (index >= size) {
            return;
        }
        startindex = Math.max(startindex, index);
        endindex = Math.min(endindex, size - 1);
        for (int i = startindex; i <= endindex; i++) {
            if (!list.contains(i)) {
                list.add(i);
            }
        }
        index = endindex;
    }

    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] == key) {
                putlist(nums, i - k, i + k);
            }
        }

        return list;
    }
}

public class LeetCode2200 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.findKDistantIndices(new int[]{3, 4, 9, 1, 3, 9, 5}, 9, 1);
    }
}
