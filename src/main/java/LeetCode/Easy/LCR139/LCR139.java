package LeetCode.Easy.LCR139;

/**
 * @ClassName LCR139
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 21:17
 * @Version 1.0
 */
class Solution {
    public int[] trainingPlan(int[] actions) {

        int left = 0;
        int right = actions.length - 1;
        while (left < right) {
            while (left < right && actions[left] % 2 == 1) {
                left++;
            }
            while (left < right && actions[right] % 2 == 0) {
                right--;
            }
            // change

            int temp = actions[left];
            actions[left] = actions[right];
            actions[right] = temp;
        }
        return actions;

    }
}

public class LCR139 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.trainingPlan(new int[]{1, 2, 3, 4, 5});
    }
}
