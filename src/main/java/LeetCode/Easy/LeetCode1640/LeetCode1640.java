package LeetCode.Easy.LeetCode1640;

/**
 * @ClassName LeetCode1640
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 13:04
 * @Version 1.0
 */
class Solution {
    int getindex(int n, int[][] pieces) {
        int size = pieces.length;
        for (int i = 0; i < size; i++) {
            if (pieces[i][0] == n) {
                return i;
            }
        }
        return -1;
    }

    public boolean canFormArray(int[] arr, int[][] pieces) {

        int index = 0;
        int size = arr.length;
        while (index < size) {
            int piindex = getindex(arr[index], pieces);
            if (piindex == -1) {
                return false;
            }

            // 过掉一行
            int column = pieces[piindex].length;
            for (int i = 0; i < column; i++) {
                if (arr[index++] != pieces[piindex][i]) {
                    return false;
                }
            }

        }
        return true;
    }
}

public class LeetCode1640 {
}
