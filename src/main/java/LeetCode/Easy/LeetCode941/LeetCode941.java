package LeetCode.Easy.LeetCode941;

/**
 * @ClassName LeetCode941
 * @Description TODO
 * @Author point
 * @Date 2023/8/14 22:15
 * @Version 1.0
 */
class Solution {
    public boolean validMountainArray(int[] arr) {

        boolean up = true;
        int size = arr.length;
        if (size <= 2) {
            return false;
        }
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < size; i++) {
            if (max < arr[i]) {
                maxIndex = i;
                max = arr[i];
            }
            if (i != 0 && arr[i - 1] == arr[i]) {
                return false;
            }
        }
        if (maxIndex == 0 || maxIndex == size - 1) {
            return false;
        }
        // 左右两边找
        for (int i = maxIndex; i > 0; i--) {
            if (arr[i - 1] >= arr[i]) {
                return false;
            }
        }
        for (int i = maxIndex; i < size - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

public class LeetCode941 {
}
