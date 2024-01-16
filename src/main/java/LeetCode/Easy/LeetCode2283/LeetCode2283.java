package LeetCode.Easy.LeetCode2283;

/**
 * @ClassName LeetCode2283
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 0:39
 * @Version 1.0
 */
class Solution {
    public boolean digitCount(String num) {

        int[] list = new int[10];
        int size = num.length();
        for (int i = 0; i < size; i++) {
            list[num.charAt(i) - '0']++;
        }

        for (int i = 0; i < size; i++) {
            if (list[i] != (num.charAt(i) - '0')) {
                return false;
            }
        }
        return true;
    }
}

public class LeetCode2283 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.digitCount( "030"));
    }
}
