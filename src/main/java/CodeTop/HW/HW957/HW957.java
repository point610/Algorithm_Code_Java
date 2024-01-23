package CodeTop.HW.HW957;

import java.util.Arrays;

class Solution {
    private boolean is(int[] ll, int index) {
        return (ll[index - 1] == 1 && ll[index + 1] == 1) || (ll[index - 1] == 0 && ll[index + 1] == 0);
    }

    private int[] cells;

    private boolean change() {
        int size = cells.length;
        int[] aa = new int[size];
        aa[0] = 0;
        aa[size - 1] = 0;
        for (int i = 1; i < size - 1; i++) {
            if (is(cells, i)) {
                aa[i] = 1;
            } else {
                aa[i] = 0;
            }
        }

        for (int i = 0; i < size; i++) {
            if (cells[i] != aa[i]) {
                for (int j = 0; j < size; j++) {
                    cells[j] = aa[j];
                }
                return false;
            }
        }
        return true;
    }

    public int[] prisonAfterNDays(int[] cells, int n) {
        n %= 14;
        if (n == 0) {
            n = 14;
        }
        this.cells = cells;
        for (int i = 0; i < n; i++) {
            if (change()) {
                break;
            }
        }
        return cells;
    }
}

public class HW957 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.prisonAfterNDays(new int[]{0, 1, 0, 1, 1, 0, 0, 1}, 7)));
        System.out.println(Arrays.toString(solution.prisonAfterNDays(new int[]{1, 0, 0, 1, 0, 0, 1, 0}, 1000000000)));
        System.out.println(Arrays.toString(solution.prisonAfterNDays(new int[]{1, 1, 0, 1, 1, 0, 0, 1}, 300663720)));
    }
}
