package LeetCode.Easy.LeetCode1886;

/**
 * @ClassName LeetCode1886
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 11:36
 * @Version 1.0
 */
class Solution {
    boolean same = true;


    int[][] getrotate(int[][] mat, int[][] target) {
        int n = mat.length;

        int[][] temp = new int[n][n];

        for (int i = 0, ti = n - 1; i < n; i++, ti--) {
            for (int j = 0, tj = 0; j < n; j++, tj++) {
                temp[tj][ti] = mat[i][j];
            }
        }

        // issame
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (target[i][j] != temp[i][j]) {
                    return temp;
                }
            }
        }
        same = true;

        return temp;
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;  // issame
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (target[i][j] != mat[i][j]) {
                    same = false;
                }
            }
        }
        if (same) {
            return true;
        }

        for (int i = 0; i < 3; i++) {
            mat = getrotate(mat, target);
            if (same) {
                return true;
            }
        }
        return false;
    }
}

public class LeetCode1886 {
}
