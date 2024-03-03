package CodeTop.HW2.HW989;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int upper = 0;

        int oneindex = num.length - 1;
        while (0 <= oneindex) {

            int temp = upper + num[oneindex] + k % 10;
            k /= 10;
            upper = temp / 10;
            list.add(0, temp % 10);

            oneindex--;
        }
        while (k != 0) {
            int temp = upper  + k % 10;
            k /= 10;
            upper = temp / 10;
            list.add(0, temp % 10);
        }
        if (upper != 0) {
            list.add(0, upper);
        }
        return list;
    }

}

public class HW989 {
}
