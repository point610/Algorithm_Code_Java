package LeetCode.Easy.MS.MS1701;

/**
 * @ClassName MS1701
 * @Description TODO
 * @Author point
 * @Date 2023/10/12 15:51
 * @Version 1.0
 */
class Solution {
    public int add(int a, int b) {
        while (b != 0) {
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;
        }
        return a;
    }
}

public class MS1701 {
}
