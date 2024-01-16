package LeetCode.Middle.LeetCode1465;

import java.util.Arrays;

/**
 * @ClassName LeetCode1465
 * @Description TODO
 * @Author point
 * @Date 2023/10/27 22:27
 * @Version 1.0
 */
class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        int hsize = horizontalCuts.length;
        int vsize = verticalCuts.length;
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int hengmax = Math.max(horizontalCuts[0], h - horizontalCuts[hsize - 1]);
        int shumax = Math.max(verticalCuts[0], w - verticalCuts[vsize - 1]);
        for (int i = 0; i < hsize - 1; i++) {
            hengmax = Math.max(hengmax, horizontalCuts[i + 1] - horizontalCuts[i]);
        }
        for (int i = 0; i < vsize - 1; i++) {
            shumax = Math.max(shumax, verticalCuts[i + 1] - verticalCuts[i]);
        }
        return (int) ((((long) hengmax * shumax)) % 1000000007);
    }
}

public class LeetCode1465 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.maxArea(5, 4, new int[]{3, 1}, new int[]{1});
    }
}
