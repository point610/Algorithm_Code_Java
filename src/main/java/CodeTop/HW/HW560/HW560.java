package CodeTop.HW.HW560;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = i; j < size; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}

public class HW560 {
}
