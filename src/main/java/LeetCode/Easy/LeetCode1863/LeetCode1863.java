package LeetCode.Easy.LeetCode1863;

/**
 * @ClassName LeetCode1863
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 10:44
 * @Version 1.0
 */
class Solution {

    int size;

    int sum = 0;

    void DFS(int temp, int[] nums, int index) {
        if (index == size) {
            sum += temp;
            return;
        }
        DFS(temp, nums, index + 1);
        DFS(temp ^ nums[index], nums, index + 1);


    }

    public int subsetXORSum(int[] nums) {
        this.size = nums.length;
        DFS(0, nums, 0);

        return sum;
    }
}

public class LeetCode1863 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.subsetXORSum(new int[]{1, 3}));
    }
}
