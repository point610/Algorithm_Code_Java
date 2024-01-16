package LeetCode.Easy.LCR186;

import java.util.Arrays;

/**
 * @ClassName LCR186
 * @Description TODO
 * @Author point
 * @Date 2023/10/9 23:28
 * @Version 1.0
 */
class Solution {
    public boolean checkDynasty(int[] places) {
        int zerosize = 0;
        for (int i = 0; i < 5; i++) {
            if (places[i] == 0) {
                zerosize++;
            }
        }
        if (zerosize == 0) {
            Arrays.sort(places);
            for (int i = 0; i < 4; i++) {
                if (places[i] + 1 != places[i + 1]) {
                    return false;
                }
            }
            return true;
        } else {
            Arrays.sort(places);
            int steps = 0;
            for (int i = zerosize; i < 4; i++) {
                if (places[i + 1] == places[i]){
                    return false;
                }
                steps += (places[i + 1] - places[i]);
                steps--;
            }
            return zerosize >= steps;
        }
    }
}

public class LCR186 {
}
