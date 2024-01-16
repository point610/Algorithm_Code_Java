package LeetCode.Easy.LeetCode1287;

/**
 * @ClassName LeetCode1287
 * @Description TODO
 * @Author point
 * @Date 2023/9/13 11:10
 * @Version 1.0
 */
class Solution {
    public int findSpecialInteger(int[] arr) {
        int size = arr.length;
        double temp = size * 1.0 / 4;
        for (int i = 0; i < size; i++) {
            int current = arr[i];
            int times = 0;
            while (i < size && arr[i] == current) {
                i++;
                times++;
            }
            if (times > temp) {
                return current;
            }
            i--;
        }
        return arr[size - 1];
    }
}

public class LeetCode1287 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findSpecialInteger(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 12, 12, 12}));
    }
}
