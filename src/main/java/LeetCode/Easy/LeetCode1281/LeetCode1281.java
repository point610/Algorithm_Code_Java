package LeetCode.Easy.LeetCode1281;

/**
 * @ClassName LeetCode1281
 * @Description TODO
 * @Author point
 * @Date 2023/8/9 0:15
 * @Version 1.0
 */
class Solution {
    public int subtractProductAndSum(int n) {
        int ji = 1;
        int he = 0;
        while (n != 0) {
            int temp = n % 10;
            ji *= temp;
            he += temp;

            n /= 10;
        }
        return ji - he;
    }
}

public class LeetCode1281 {
    public static void main(String[] args) {
        System.out.println(9 * 9 * 9 * 9 * 9);
    }
}
