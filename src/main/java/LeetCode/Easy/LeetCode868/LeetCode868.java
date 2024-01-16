package LeetCode.Easy.LeetCode868;

/**
 * @ClassName LeetCode868
 * @Description TODO
 * @Author point
 * @Date 2023/8/12 13:22
 * @Version 1.0
 */
class Solution {
    public int binaryGap(int n) {
        String binaryString = Integer.toBinaryString(n);
        int size = binaryString.length();
        int lastOne = -1;
        int max = 0;
        for (int i = 0; i < size; i++) {
            if (binaryString.charAt(i) == '1') {
                if (lastOne != -1) {
                    max = Math.max(max, i - lastOne);
                }
                lastOne = i;
            }

        }
        return max;
    }
}

public class LeetCode868 {
}
