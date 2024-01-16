package LeetCode.Easy.LeetCode1491;

/**
 * @ClassName LeetCode1491
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 16:06
 * @Version 1.0
 */
class Solution {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int size = salary.length;
        double sum = 0;
        for (int i = 0; i < size; i++) {
            max = Math.max(max, salary[i]);
            min = Math.min(min, salary[i]);
            sum += salary
                    [i];
        }

        return (sum - max - min)/(size-2);
    }
}

public class LeetCode1491 {
}
