package LeetCode.Easy.LeetCode1128;

import java.util.Arrays;

/**
 * @ClassName LeetCode1128
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 17:54
 * @Version 1.0
 */
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int size = dominoes.length;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (dominoes[i][0] > dominoes[i][1]) {
                int temp = dominoes[i][0];
                dominoes[i][0] = dominoes[i][1];
                dominoes[i][1] = temp;
            }
        }
        Arrays.sort(dominoes, ((o1, o2) -> {
            if (o1[0] == o2[0]) {
                return Integer.compare(o1[1], o2[1]);
            }
            return Integer.compare(o1[0], o2[0]);
        }));
        // 开始遍历
        for (int i = 0; i < size; i++) {
            int n = 1;
            int one = dominoes[i][0];
            int two = dominoes[i][1];
            for (int j = i + 1; j <= size; j++) {
                if (j < size && one == dominoes[j][0] && two == dominoes[j][1]) {
                    n++;
                } else {
                    i = j - 1;
                    break;
                }
            }
            sum += getSumtemp(n);
        }

        return sum;
    }

    int getSumtemp(int n) {
        return (n - 1) * n / 2;
    }

}

public class LeetCode1128 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.numEquivDominoPairs(new int[][]{{2, 2}, {2, 1}, {2, 2}, {2, 1}, {2, 2}, {1, 2}, {2, 2}, {1, 1}, {1, 1}});
    }
}
