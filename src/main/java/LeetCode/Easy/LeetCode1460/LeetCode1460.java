package LeetCode.Easy.LeetCode1460;

/**
 * @ClassName LeetCode1460
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 0:42
 * @Version 1.0
 */
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] one = new int[1001];
        int size = target.length;
        for (int i = 0; i < size; i++) {
            one[target[i]]++;
        }
        for (int i = 0; i < size; i++) {
            one[arr[i]]--;
        }
        for (int i = 0; i < 1001; i++) {
            if (one[i] != 0) {
                return false;
            }
        }
        return true;
    }
}

public class LeetCode1460 {
}
