package LeetCode.Easy.LeetCode2660;

/**
 * @ClassName LeetCode2660
 * @Description TODO
 * @Author point
 * @Date 2023/10/3 12:48
 * @Version 1.0
 */
class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int one = 0;
        int two = 0;
        for (int i = 0; i < player1.length; i++) {
            if (i == 1 && player1[0] == 10) {
                one += (2 * player1[i]);
                continue;
            }
            if (i > 1 && (player1[i - 2] == 10 || player1[i - 1] == 10)) {
                one += (2 * player1[i]);
                continue;
            }
            one += player1[i];
        }
        for (int i = 0; i < player2.length; i++) {
            if (i == 1 && player2[0] == 10) {
                two += (2 * player2[i]);
                continue;
            }
            if (i > 1 && (player2[i - 2] == 10 || player2[i - 1] == 10)) {
                two += (2 * player2[i]);
                continue;
            }
            two += player2[i];
        }
        if (one == two) {
            return 0;
        } else if (one > two) {
            return 1;
        } else {
            return 2;
        }
    }
}

public class LeetCode2660 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isWinner(new int[]{10, 2, 2, 3}, new int[]{3, 8, 4, 5});
    }
}
