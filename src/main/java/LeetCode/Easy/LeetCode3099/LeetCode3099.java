package LeetCode.Easy.LeetCode3099;

class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = getsum(x);
        if (x % sum == 0) {
            return sum;
        }
        return -1;
    }

    private int getsum(int x) {
        int sum = 0;
        while (x != 0) {
            sum += x % 10; // 获取最后一位数字并累加到总和中
            x = x / 10;
        }
        return sum;
    }
}

public class LeetCode3099 {
}
