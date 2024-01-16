package LeetCode.Easy.LCP40;

import java.util.Arrays;

/**
 * @ClassName LCP40
 * @Description TODO
 * @Author point
 * @Date 2023/10/12 18:54
 * @Version 1.0
 */
class Solution {
    public int maxmiumScore(int[] cards, int cnt) {
        Arrays.sort(cards);
        int size = cards.length;
        int sum = 0;
        int minou = Integer.MAX_VALUE;
        int minji = Integer.MAX_VALUE;
        for (int i = size - 1; i >= size - cnt; i--) {
            sum += cards[i];
            if (cards[i] % 2 == 0) {
                minou = Math.min(minou, cards[i]);
            } else {
                minji = Math.min(minji, cards[i]);
            }
        }
        if (sum % 2 == 0) {
            return sum;
        }
        int maxou = 0;
        int maxji = 0;
        for (int i = 0; i < size - cnt; i++) {
            if (cards[i] % 2 == 0) {
                maxou = Math.max(maxou, cards[i]);
            } else {
                maxji = Math.max(maxji, cards[i]);
            }
        }
        if (minou == Integer.MAX_VALUE) {
            if (maxou == 0) {
                return 0;
            } else {
                return sum + maxou - minji;
            }
        } else {
            if (maxou == 0 && maxji == 0) {
                return 0;
            } else if (maxou == 0) {
                return sum - minou + maxji;
            } else if (maxji == 0) {
                return sum - minji + maxou;
            } else {
                return Math.max(sum - minji + maxou,sum - minou + maxji);
            }

        }

    }
}

public class LCP40 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.maxmiumScore(new int[]{9, 5, 9, 1, 6, 10, 3, 4, 5, 1}, 2);
    }
}
