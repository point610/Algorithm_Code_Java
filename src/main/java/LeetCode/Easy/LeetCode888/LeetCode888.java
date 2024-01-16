package LeetCode.Easy.LeetCode888;

import java.util.Arrays;

/**
 * @ClassName LeetCode888
 * @Description TODO
 * @Author point
 * @Date 2023/8/12 14:04
 * @Version 1.0
 */
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        int sum = 0;
        int onesum = 0;
        int twosum = 0;
        int oneSize = aliceSizes.length;
        int twoSize = bobSizes.length;
        for (int i = 0; i < oneSize; i++) {
            sum += aliceSizes[i];
        }
        onesum = sum;

        for (int i = 0; i < twoSize; i++) {
            sum += bobSizes[i];
        }
        twosum = sum - onesum;

        sum /= 2;
        if (onesum <= twosum) {
            for (int i = 0; i < oneSize; i++) {
                int findNumber = sum - onesum + aliceSizes[i];
                for (int j = 0; j < twoSize; j++) {
                    if (bobSizes[j] == findNumber) {
                        return new int[]{aliceSizes[i], bobSizes[j]};
                    }
                }
            }
        } else {
            for (int i = 0; i < twoSize; i++) {
                int findNumber = sum - twosum + bobSizes[i];
                for (int j = 0; j < oneSize; j++) {
                    if (aliceSizes[j] == findNumber) {
                        return new int[]{aliceSizes[j], bobSizes[i]};
                    }
                }
            }
        }
        return null;
    }
}

public class LeetCode888 {
    public static void main(String[] args) {
        Solution solution =
                new Solution();
        solution.fairCandySwap(new int[]{1, 2, 5}, new int[]{2, 4});
    }
}
