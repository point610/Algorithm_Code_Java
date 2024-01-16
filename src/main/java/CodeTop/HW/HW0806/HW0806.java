package CodeTop.HW.HW0806;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName HW0806
 * @Description TODO
 * @Author point
 * @Date 2023/12/23 22:02
 * @Version 1.0
 */
class Solution {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        move(A.size(), A, B, C);
    }

    private void move(int size, List<Integer> a, List<Integer> b, List<Integer> c) {
        if (size == 1) {
            c.add(0, a.remove(0));
            return;
        }

        move(size - 1, a, c, b);
        c.add(0, a.remove(0));
        move(size - 1, b, a, c);

    }
}

public class HW0806 {
}
