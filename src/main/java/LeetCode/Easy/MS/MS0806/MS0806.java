package LeetCode.Easy.MS.MS0806;

import java.util.List;

/**
 * @ClassName MS0806
 * @Description TODO
 * @Author point
 * @Date 2023/10/12 11:43
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

public class MS0806 {
}
