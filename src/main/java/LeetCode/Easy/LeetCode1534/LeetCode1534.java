package LeetCode.Easy.LeetCode1534;

/**
 * @ClassName LeetCode1534
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 23:11
 * @Version 1.0
 */
class Solution {
    boolean isless(int one, int two, int three) {
        return Math.abs(one - two) <= three;
    }

    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int size = arr.length;
        int res = 0;
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {

                for (int k = j + 1; k < size; k++) {
                    if (isless(arr[i], arr[k], c)&&isless(arr[i], arr[j], a)&&isless(arr[k], arr[j], b)) {
                        res++;
                    }


                }
            }
        }
        return res;
    }
}

public class LeetCode1534 {
}
