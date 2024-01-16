package LeetCode.Easy.LeetCode1550;

/**
 * @ClassName LeetCode1550
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 23:51
 * @Version 1.0
 */
class Solution {
    boolean isji(int n) {
        return n % 2 == 1;
    }

    public boolean threeConsecutiveOdds(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 2; i++) {
            if (isji(arr[i]) && isji(arr[i + 1]) && isji(arr[i + 2])) {
                return true;
            }
        }
        return false;
    }
}

public class LeetCode1550 {
}
