package LeetCode.Easy.LeetCode2511;

/**
 * @ClassName LeetCode2511
 * @Description TODO
 * @Author point
 * @Date 2023/10/2 12:46
 * @Version 1.0
 */
class Solution {
    public int captureForts(int[] forts) {

        int max = 0;
        int size = forts.length;
        for (int i = 0; i < size; i++) {
            if (forts[i] == 1) {
                // find 0 in (left , right)
                int left = i - 1;
                int right = i + 1;

                while (0 <= left && forts[left] == 0) {
                    left--;
                }
                while (right < size && forts[right] == 0) {
                    right++;
                }
                if (0 <= left && forts[left] == -1) {
                    max = Math.max(max, i - left - 1);
                }
                if (right < size && forts[right] == -1) {
                    max = Math.max(max, right - i - 1);
                }

            }
        }

        return max;
    }
}

public class LeetCode2511 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.captureForts(new int[]{-1, -1, 0, 1, 0, 0, 1, -1, 1, 0}));
    }
}
