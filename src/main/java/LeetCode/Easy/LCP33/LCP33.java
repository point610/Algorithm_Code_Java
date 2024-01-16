package LeetCode.Easy.LCP33;

/**
 * @ClassName LCP33
 * @Description TODO
 * @Author point
 * @Date 2023/10/12 17:06
 * @Version 1.0
 */
class Solution {
    public int storeWater(int[] bucket, int[] vat) {
        int maxtimes = 0;
        int size = vat.length;
        for (int i = 0; i < size; i++) {
            maxtimes = Math.max(maxtimes, vat[i]);
        }
        if (maxtimes == 0) {
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 1; i <= maxtimes; i++) {
            int t = 0;
            for (int j = 0; j < size; j++) {
                t += Math.max(0, Math.ceil(vat[j] * 1.0 / i) - bucket[j]);
            }
            res = Math.min(res, t + i);
        }
        return res;
    }
}

public class LCP33 {
}
