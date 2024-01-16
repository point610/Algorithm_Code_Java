package LeetCode.Easy.LeetCode2078;

/**
 * @ClassName LeetCode2078
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 12:38
 * @Version 1.0
 */
class Solution {
    public int maxDistance(int[] colors) {
        if (colors.length <= 2) {
            return 1;
        }
        int dist = 0;
        int size = colors.length;
        for (int i = 0; i < size - 1; i++) {
            int current = colors[i];
            for (int j = size - 1; j > i; j--) {
                if (colors[j] != current) {
                    dist = Math.max(dist, j - i);
                }
            }
        }
        return dist;

    }
}

public class LeetCode2078 {
}
