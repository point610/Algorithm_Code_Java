package LeetCode.Middle.LeetCode900;

import java.util.ArrayList;
import java.util.List;

class RLEIterator {
    int[] encoding;
    int index;

    public RLEIterator(int[] encoding) {
        index = 0;
        this.encoding = encoding;
    }

    public int next(int n) {

        while (n > 0 && index < encoding.length) {
            if (encoding[index] > n) {
                encoding[index] -= n;
                return encoding[index + 1];
            } else {
                n -= encoding[index];
                index += 2;
            }
        }
        return -1;

    }
}

/**
 * Your RLEIterator object will be instantiated and called as such:
 * RLEIterator obj = new RLEIterator(encoding);
 * int param_1 = obj.next(n);
 */
public class LeetCode900 {
}
