package LeetCode.Easy.LeetCode506;

import java.util.*;

/**
 * @ClassName LeetCode506
 * @Description TODO
 * @Author point
 * @Date 2023/8/9 0:51
 * @Version 1.0
 */
    class Solution {
        Map<Integer, Integer> hashMap = new HashMap<>();

        public String[] findRelativeRanks(int[] score) {
            int size = score.length;
            int[] temp = new int[size];
            for (int i = 0; i < size; i++) {
                temp[i] = score[i];
            }

            Arrays.sort(score);
            for (int i = size - 1; i >= 0; i--) {
                hashMap.put(score[i], size - i);
            }

            String[] res = new String[size];
            for (int i = 0; i < size; i++) {
                int paiMing = hashMap.get(temp[i]);
                switch (paiMing) {
                    case 1: {
                        res[i] = "Gold Medal";
                        break;
                    }
                    case 2: {
                        res[i] = "Silver Medal";
                        break;
                    }
                    case 3: {
                        res[i] = "Bronze Medal";
                        break;
                    }
                    default: {
                        res[i] = String.valueOf(paiMing);
                    }
                }
            }
            for (int i = 0; i < size; i++) {
                System.out.println(res[i]);
            }
            return res;
        }
    }

public class LeetCode506 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.findRelativeRanks(new int[]{10,3,8,9,4});
    }
}
