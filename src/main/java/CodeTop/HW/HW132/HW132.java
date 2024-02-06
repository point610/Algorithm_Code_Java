package CodeTop.HW.HW132;


import java.util.Arrays;

class Solution {
    public int minCut(String s) {
        int size = s.length();
        boolean[][] huiwen = new boolean[size][size];
        // 需要将判断的二维数组赋值为 true
        for (int i = 0; i < size; i++) {
            Arrays.fill(huiwen[i], true);
        }

        for (int i = size - 1; i >= 0; i--) {
            for (int j = i + 1; j < size; j++) {
                huiwen[i][j] = (s.charAt(i) == s.charAt(j)) && huiwen[i + 1][j - 1];
            }
        }

        int[] lll = new int[size];
        Arrays.fill(lll, Integer.MAX_VALUE);
        for (int i = 0; i < size; i++) {
            if (huiwen[0][i]) {
                lll[i] = 0;
            } else {
                for (int j = 0; j < i; j++) {
                    // 判断是否为回文串
                    if (huiwen[j + 1][i]) {
                        lll[i] = Math.min(lll[i], lll[j] + 1);
                    }
                }
            }
        }

        return lll[size - 1];
    }
}

public class HW132 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minCut("aab"));
        System.out.println(solution.minCut("a"));
        System.out.println(solution.minCut("ab"));
    }
}
