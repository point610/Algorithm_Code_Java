package LeetCode.Easy.LeetCode492;

/**
 * @ClassName LeetCode492
 * @Description TODO
 * @Author point
 * @Date 2023/8/3 22:01
 * @Version 1.0
 */
class Solution {
    public int[] constructRectangle(int area) {
        int temp = (int) Math.sqrt(area);
        while (area % temp != 0) {
            temp--;
        }
        return new int[]{area / temp, temp};

    }
}

public class LeetCode492 {
}
