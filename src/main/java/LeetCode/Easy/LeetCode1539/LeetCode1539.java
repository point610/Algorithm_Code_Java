package LeetCode.Easy.LeetCode1539;

/**
 * @ClassName LeetCode1539
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 23:18
 * @Version 1.0
 */
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int size = arr.length;
        if (size + k > arr[size - 1]) {
            return size + k;
        }

        int current = 1;
        int missnumber = 0;
        int index = 0;
        while (true) {
            if (arr[index] == current) {
                current++;
                index++;
            } else {
                missnumber++;
                if (missnumber == k) {
                    return current;
                }

                current++;
            }

        }
    }
}

public class LeetCode1539 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findKthPositive(new int[]{2,3,4,7,11}, 5));
    }
}
