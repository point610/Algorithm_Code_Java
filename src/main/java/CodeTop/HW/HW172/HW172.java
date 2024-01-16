package CodeTop.HW.HW172;

/**
 * @ClassName HW172
 * @Description TODO
 * @Author point
 * @Date 2023/12/23 20:40
 * @Version 1.0
 */
class Solution {

    public int trailingZeroes(int n) {
        int count = 0;
        while (n >= 5) {
            n /= 5;
            count += n;
        }return count;
    }
}

public class HW172 {
}
