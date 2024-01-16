package LeetCode.Easy.LeetCode1046;

import java.util.Arrays;

/**
 * @ClassName LeetCode1046
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 16:13
 * @Version 1.0
 */
class Solution {
    public int lastStoneWeight(int[] stones) {
        int size = stones.length;
        if (size == 1) {
            return stones[0];
        }

        while (true) {
            Arrays.sort(stones);
            int one = stones[size - 1];
            int two = stones[size - 2];
            if (one == two) {
                size -= 2;
                if (size == 0) {
                    return 0;
                }
                if (size == 1) {
                    return stones[0];
                }
                // copy
                int[] temp = new int[size];
                for (int i = 0; i < size; i++) {
                    temp[i] = stones[i];
                }
                stones = temp;
            } else {
                size -= 2;
                if (size == 0) {
                    return one - two;
                }
                // copy
                int[] temp = new int[size + 1];
                for (int i = 0; i < size; i++) {
                    temp[i] = stones[i];
                }
                temp[size] = one - two;
                size++;
                stones = temp;
            }

        }
    }
}

public class LeetCode1046 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }
}
