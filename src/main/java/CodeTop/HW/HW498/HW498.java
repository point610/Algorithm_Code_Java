package CodeTop.HW.HW498;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName HW498
 * @Description TODO
 * @Author point
 * @Date 2023/12/27 17:13
 * @Version 1.0
 */
class Solution {
    private int row;

    private int col;

    public int[] findDiagonalOrder(int[][] mat) {
        row = mat.length;
        col = mat[0].length;
        List<Integer> list = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < col; i++) {
            list.addAll(getlist(index % 2, mat, 0, i));
            index++;
        }
        for (int i = 1; i < row; i++) {
            list.addAll(getlist(index % 2, mat, i, col - 1));
            index++;
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    private boolean in(int x, int y) {
        return 0 <= x && x < row && 0 <= y && y < col;
    }

    private List<Integer> getlist(int type, int[][] mat, int x, int y) {
        List<Integer> temp = new ArrayList<>();

        while (in(x, y)) {
            temp.add(mat[x][y]);
            x++;
            y--;
        }

        if (type == 0) {
            Collections.reverse(temp);
        }
        return temp;
    }
}

public class HW498 {
}
