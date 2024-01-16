package LeetCode.Easy.LCP01;

/**
 * @ClassName LCP01
 * @Description TODO
 * @Author point
 * @Date 2023/9/20 22:43
 * @Version 1.0
 */
class Solution {
    public int game(int[] guess, int[] answer) {
        int index = 0;
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (guess[i] == answer[index]) {
                index++;
                count++;
            }
        }
        return count;
    }
}

public class LCP01 {
}
