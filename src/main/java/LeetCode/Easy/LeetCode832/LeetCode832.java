package LeetCode.Easy.LeetCode832;

/**
 * @ClassName LeetCode832
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 23:53
 * @Version 1.0
 */
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int column = image[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column / 2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][column - j - 1];
                image[i][column - j - 1] = temp;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column ; j++) {
                image[i][j] ^= 1;
            }
        }
        return image;

    }
}

public class LeetCode832 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}});
    }
}
