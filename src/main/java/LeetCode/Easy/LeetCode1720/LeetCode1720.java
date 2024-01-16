package LeetCode.Easy.LeetCode1720;

/**
 * @ClassName LeetCode1720
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 16:25
 * @Version 1.0
 */
class Solution {
    public int[] decode(int[] encoded, int first) {
        int size = encoded.length;
        int[] res = new int[size + 1];
        res[0] = first;
        for (int i = 0; i < size; i++) {
            res[i + 1] = res[i] ^ encoded[i];
        }
        return res;
    }
}

public class LeetCode1720 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.decode(new int[]{6, 2, 7, 3}, 4);
    }
}
