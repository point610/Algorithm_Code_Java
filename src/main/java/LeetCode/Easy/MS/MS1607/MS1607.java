package LeetCode.Easy.MS.MS1607;

/**
 * @ClassName MS1607
 * @Description TODO
 * @Author point
 * @Date 2023/10/12 12:05
 * @Version 1.0
 */
class Solution {
    public int maximum(int a, int b) {
        long k = (long) a - (long) b;
        int m = (int) (k >> 63);
        return (1 + m) * a - b * m;

    }
}

public class MS1607 {
}
