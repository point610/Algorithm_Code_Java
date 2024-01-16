package LeetCode.Easy.LeetCode1089;

/**
 * @ClassName LeetCode1089
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 17:18
 * @Version 1.0
 */
class Solution {
    public void duplicateZeros(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                change(arr, i);
                i += 1;
            }
        }

    }

    void change(int[] arr, int index) {
        int size = arr.length;
        for (int i = size - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
    }
}

public class LeetCode1089 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});
    }
}
