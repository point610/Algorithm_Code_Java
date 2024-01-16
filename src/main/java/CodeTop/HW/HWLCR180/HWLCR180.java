package CodeTop.HW.HWLCR180;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName HWLCR180
 * @Description TODO
 * @Author point
 * @Date 2023/12/23 20:45
 * @Version 1.0
 */
class Solution {
    public int[][] fileCombination(int target) {
        List<int[]> list = new ArrayList<>();

        int left = 1;
        int right = 1;
        int sum = 0;

        while (true) {
            // 先使用right对sum进行累加
            while (sum < target) {
                sum += right;
                right++;
            }
            // 进行判断
            if (sum == target) {
                list.add(getarr(left, right));
            }
            // 判断退出条件
            if (right > target) {
                break;
            }
            // 强行将sum减去left，使得list向右移动
            sum -= left;
            left++;
            // 对滑动窗口进行缩小
            while (sum > target) {
                sum -= left;
                left++;
            }
        }

        return list.toArray(new int[list.size()][]);

    }

    private int[] getarr(int left, int right) {
        int[] list = new int[right - left];
        int index = 0;
        for (int i = left; i < right; i++) {
            list[index++] = i;
        }
        return list;
    }
}

public class HWLCR180 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.fileCombination(93)));
    }
}
