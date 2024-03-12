package LeetCode.Easy.LeetCode303;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

class NumArray {
    private int[] sum;

    public NumArray(int[] nums) {
        this.sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = nums[i] + sum[i];
        }
    }

    public int sumRange(int left, int right) {
        return sum[right + 1] - sum[left];
    }
}

public class LeetCode303 {
    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0, 2));
    }
}
