package CodeTop.HW.HW169;


/**
 * @ClassName HW169
 * @Description TODO
 * @Author point
 * @Date 2023/12/24 20:23
 * @Version 1.0
 */
class Solution {
    public int majorityElement(int[] nums) {
        int current = nums[0];
        int times = 1;

        for (int i = 1; i < nums.length; i++) {

            if (current != nums[i]) {
                times--;
                if (times == -1) {
                    times = 1;
                    current = nums[i ];
                }
            } else {
                times++;
            }

        }
        return current;

    }
}

public class HW169 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.majorityElement(new int[]{3, 2, 3}));
        System.out.println(solution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
