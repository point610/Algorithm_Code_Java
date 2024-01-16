package LeetCode.Easy.LeetCode1732;

/**
 * @ClassName LeetCode1732
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 16:35
 * @Version 1.0
 */
class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int size = gain.length;
        int temp = 0;
        for (int i = 0; i < size; i++) {
            temp += gain[i];
            max = Math.max(max, temp);
        }
        return max;
    }
}

public class LeetCode1732 {
}
