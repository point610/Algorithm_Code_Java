package LeetCode.Easy.LeetCode2169;

/**
 * @ClassName LeetCode2169
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 11:56
 * @Version 1.0
 */
class Solution {
    public int countOperations(int num1, int num2) {
        int times = 0;
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
            times++;
        }
        return times;

    }
}

public class LeetCode2169 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.countOperations(2, 3);
    }
}
