package CodeTop.HW.HW888;

import java.util.Arrays;

/**
 * @ClassName HW888
 * @Description TODO
 * @Author point
 * @Date 2023/12/24 15:52
 * @Version 1.0
 */
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int onesum = 0;
        int twosum = 0;
        for (int ii : aliceSizes) {
            onesum += ii;
        }
        for (int ii : bobSizes) {
            twosum += ii;
        }
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);

        if (onesum < twosum) {
            int steps = twosum - onesum;
            int oneindex = 0;
            int twoindex = 0;
            while (bobSizes[twoindex] <= aliceSizes[oneindex]) {
                twoindex++;
            }
            while (true) {
                int temp = bobSizes[twoindex] - aliceSizes[oneindex];
                if (temp * 2 == steps) {
                    return new int[]{aliceSizes[oneindex], bobSizes[twoindex]};
                } else if (temp*2 < steps) {
                    twoindex++;
                } else {
                    oneindex++;
                }
            }
        } else {
            int steps = onesum - twosum;
            int oneindex = 0;
            int twoindex = 0;
            while (bobSizes[twoindex] >= aliceSizes[oneindex]) {
                oneindex++;
            }
            while (true) {
                int temp = aliceSizes[oneindex] - bobSizes[twoindex];
                if (temp * 2 == steps) {
                    return new int[]{aliceSizes[oneindex], bobSizes[twoindex]};
                } else if (temp*2 > steps) {
                    twoindex++;
                } else {
                    oneindex++;
                }
            }
        }
    }
}

public class HW888 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.fairCandySwap(new int[]{
                32, 38, 8, 1, 9
        }, new int[]{
                68, 92
        })));
    }
}
