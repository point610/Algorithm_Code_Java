package LeetCode.Easy.LeetCode2347;

/**
 * @ClassName LeetCode2347
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 15:24
 * @Version 1.0
 */
class Solution {

    public String bestHand(int[] ranks, char[] suits) {
        if (suits[0] == suits[1] && suits[0] == suits[2] && suits[0] == suits[3] && suits[0] == suits[4]) {
            return "Flush";
        }
        int[] arr = new int[14];
        for (int i = 0; i < 5; i++) {
            arr[ranks[i]]++;
        }
        for (int i = 0; i < 14; i++) {
            if (arr[i] >= 3) {
                return "Three of a Kind";
            }
        }
        for (int i = 0; i < 14; i++) {
            if (arr[i] >= 2) {
                return "Pair";
            }
        }
        return "High Card";

    }
}

public class LeetCode2347 {
}
