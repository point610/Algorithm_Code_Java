package LeetCode.Easy.LeetCode476;

/**
 * @ClassName LeetCode476
 * @Description TODO
 * @Author point
 * @Date 2023/7/28 0:51
 * @Version 1.0
 */
class Solution {
    public int findComplement(int num) {

        int bit = 1;
        long temp = 2;
        while (true) {
            if (temp - 1 < num) {
                bit++;
            } else {
                break;
            }
            temp *= 2;
        }
        return (int) (Math.pow(2, bit) - 1 - num);
    }
}

public class LeetCode476 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findComplement(5));
    }
}
