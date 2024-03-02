package CodeTop.HW2.HWMS0806;

import java.util.List;

class Solution {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        move(A.size(), A, B, C);
    }

    private void move(int size, List<Integer> A, List<Integer> B, List<Integer> C) {
        if (size == 1) {
            C.add(0, A.remove(0));
            return;
        }
        move(size - 1, A, C, B);
        C.add(0, A.remove(0));
        move(size - 1, B, A, C);
    }
}

public class HWMS0806 {
}
