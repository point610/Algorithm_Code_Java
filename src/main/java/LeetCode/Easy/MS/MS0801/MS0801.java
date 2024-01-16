package LeetCode.Easy.MS.MS0801;

/**
 * @ClassName MS0801
 * @Description TODO
 * @Author point
 * @Date 2023/10/11 23:51
 * @Version 1.0
 */
class Solution {
    public int waysToStep(int n) {
        int one = 1;
        int two = 2;
        int three = 4;
        switch (n) {
            case 1: {
                return 1;
            }
            case 2: {
                return 2;
            }
            case 3: {
                return 4;
            }
        }
        for (int i = 4; i <= n; i++) {
            int sum = ((one + two) % 1000000007 + three) % 1000000007;
            one = two;
            two = three;
            three = sum;
        }
        return three;

    }
}

public class MS0801 {
}
