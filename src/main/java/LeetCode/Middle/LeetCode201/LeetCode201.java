package LeetCode.Middle.LeetCode201;

class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int mask = 1 << 30;
        int res = 0;
        while (mask > 0 && ((left & mask) == (right & mask))) {
            res |= (right & mask);
            mask >>= 1;
        }
        return res;
    }
}

public class LeetCode201 {
}
