package LeetCode.Easy.LeetCode1672;

/**
 * @ClassName v
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 14:43
 * @Version 1.0
 */
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int row = accounts.length;
        int column = accounts[0].length;
        for (int i = 0; i < row; i++) {
            int temp = 0;
            for (int j = 0; j < column; j++) {
                temp += accounts[i][j];
            }
            max = Math.max(max, temp);
        }
        return max;
    }
}

public class LeetCode1672 {

}
