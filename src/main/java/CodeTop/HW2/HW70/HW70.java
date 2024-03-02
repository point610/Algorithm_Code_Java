package CodeTop.HW2.HW70;

class Solution {
    public int climbStairs(int num) {
        if (num == 0) {
            return 1;
        }
        if (num <= 2) {
            return num;
        }
        int one = 1;
        int two = 2;
        for (int i = 2; i < num; i++) {
            int temp = one + two;
            one = two;
            two = temp;
        }
        return two;

    }
}

public class HW70 {
}
