package LeetCode.Easy.LeetCode303;

/**
 * @ClassName LeetCode303
 * @Description TODO
 * @Author point
 * @Date 2023/7/13 23:24
 * @Version 1.0
 */

class NumArray {
    int[] numArrays;

    public NumArray(int[] nums) {
        numArrays = nums.clone();
    }

    public int sumRange(int left, int right) {
        int res = 0;
        for (int i = left; i <= right; i++) {
            res += numArrays[i];
        }
        return res;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
public class LeetCode303 {

}
