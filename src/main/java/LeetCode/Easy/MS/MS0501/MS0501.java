package LeetCode.Easy.MS.MS0501;

/**
 * @ClassName MS0501
 * @Description TODO
 * @Author point
 * @Date 2023/10/11 22:38
 * @Version 1.0
 */
class Solution {
    public int insertBits(int N, int M, int i, int j) {
        int mask =( 0xffffffff << j << 1 )+ ((1 << i) - 1);
        return N & mask | M << i;
    }
}

public class MS0501 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.insertBits(2032243561, 10, 24, 29));

    }
}
