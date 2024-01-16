package LeetCode.Easy.LCR190;

/**
 * @ClassName LCR190
 * @Description TODO
 * @Author point
 * @Date 2023/10/10 17:06
 * @Version 1.0
 */
class Solution {
    public int encryptionCalculate(int dataA, int dataB) {

        while (dataB != 0) {
            int c = (dataA & dataB) << 1;
            dataA = (dataA ^ dataB);
            dataB = c;
        }
        return dataA;
    }
}

public class LCR190 {
}
