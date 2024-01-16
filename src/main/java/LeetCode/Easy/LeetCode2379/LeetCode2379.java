package LeetCode.Easy.LeetCode2379;

/**
 * @ClassName LeetCode2379
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 15:45
 * @Version 1.0
 */
class Solution {
    public int minimumRecolors(String blocks, int k) {

        int size = blocks.length();
        int currentsum = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                currentsum++;
            }
        }
        int min = currentsum;
        for (int i = 1; i <= size - k; i++) {
            if (blocks.charAt(i - 1) == 'W') {
                currentsum--;
            }
            if (blocks.charAt(i + k - 1) == 'W') {
                currentsum++;
            }
            min = Math.min(min, currentsum);
        }
        return min;
    }
}

public class LeetCode2379 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minimumRecolors("WWBBBWBBBBBWWBWWWB", 16));
    }
}
