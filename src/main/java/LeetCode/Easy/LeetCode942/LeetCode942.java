package LeetCode.Easy.LeetCode942;

/**
 * @ClassName LeetCode942
 * @Description TODO
 * @Author point
 * @Date 2023/8/14 22:24
 * @Version 1.0
 */
class Solution {
    public int[] diStringMatch(String s) {
        int size = s.length();
        int up = 0;
        int down = size;
        int[] res = new int[size + 1];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == 'I') {
                res[index++] = up++;
            } else {
                res[index++] = down--;
            }
        }
        res[index] = up;
        return res;
    }
}

public class LeetCode942 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.diStringMatch("DDI");
    }
}
