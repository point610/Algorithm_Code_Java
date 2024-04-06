package LeetCode.Middle.LeetCode390;

class Solution {
    public int lastRemaining(int n) {
        if (n == 1) {
            return 1;
        }
        int step = 1;
        int res = 1;
        int index = 0;

        while (n > 1) {
            if (index % 2 == 0) {
                res += step;
            } else {
                if (n % 2 == 0) {

                } else {
                    res += step;
                }
            }
            index++;
            step = step << 1;
            n = n >> 1;
        }
        return res;
    }
}

public class LeetCode390 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lastRemaining(9));
        System.out.println(solution.lastRemaining(1));
    }
}
