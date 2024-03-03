package CodeTop.HW2.HW888;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int onesum = Arrays.stream(aliceSizes).sum();
        int twosum = Arrays.stream(bobSizes).sum();

        int diff = (onesum - twosum) / 2;
        Set<Integer> set = new HashSet<>();
        for (int bobSize : bobSizes) {
            set.add(bobSize);
        }

        for (int aliceSize : aliceSizes) {
            if (set.contains(aliceSize - diff)) {
                return new int[]{aliceSize, aliceSize - diff};
            }
        }
        return null;
    }
}

public class HW888 {
}
