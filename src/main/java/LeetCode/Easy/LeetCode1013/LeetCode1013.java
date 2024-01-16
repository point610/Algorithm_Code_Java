package LeetCode.Easy.LeetCode1013;

/**
 * @ClassName LeetCode1013
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 15:26
 * @Version 1.0
 */
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        if (sum % 3 != 0) {
            return false;
        }

        int avg = sum / 3;
        int leftIndex = 0;
        int rightIndex = size - 1;
        int temp = 0;
        while (leftIndex < size) {
            temp += arr[leftIndex];
            if (temp == avg) {
                break;
            }
            leftIndex++;
        }
        temp = 0;
        while (rightIndex >= 0) {
            temp += arr[rightIndex];
            if (temp == avg) {
                break;
            }
            rightIndex--;
        }
        if (leftIndex + 1 >= rightIndex) {
            return false;
        }
        return true;
    }
}

public class LeetCode1013 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canThreePartsEqualSum(new int[]{1,-1,1,-1}));
    }
}
