package CodeTop.HW.HW1552;

import java.util.Arrays;

class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left = 1;
        int size = position.length;
        int right = position[size - 1];
        while (left <= right) {
            // left和right和mid为步长
            int mid = (left + right) / 2;
            if (check(mid, position, m)) {
                // 答案为mid的数值
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // 可以之后一定以不可以结束
        return right;
    }

    private boolean check(int step, int[] lll, int times) {
        // count初始化为1，以为current初始化为lll[0]，算一个
        int count = 1;
        int current = lll[0];
        for (int ii : lll) {
            if ((ii - current) >= step) {
                current = ii;
                count++;
            }
        }
        return count >= times;
    }
}

public class HW1552 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxDistance(new int[]{1, 2, 3, 4, 7}, 3));
        System.out.println(solution.maxDistance(new int[]{5, 4, 3, 2, 1, 1000000000}, 2));
    }
}
