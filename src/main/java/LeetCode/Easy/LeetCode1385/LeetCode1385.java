package LeetCode.Easy.LeetCode1385;

/**
 * @ClassName LeetCode1385
 * @Description TODO
 * @Author point
 * @Date 2023/9/18 22:02
 * @Version 1.0
 */
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int sum = 0;
        int one = arr1.length;
        int two = arr2.length;
        for (int i = 0; i < one; i++) {
            boolean is = true;
            for (int j = 0; j < two; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    is = false;
                    break;
                }
            }
            if (is) {
                sum++;
            }
        }
        return sum;
    }
}

public class LeetCode1385 {
}
