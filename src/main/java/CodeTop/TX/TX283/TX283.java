package CodeTop.TX.TX283;

class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;

        int size = nums.length;
        while (right < size) {
            if (nums[right] == 0) {
                right++;
            } else {
                nums[left] = nums[right];
                left++;
                right++;
            }
        }
        for (int i = left; i < size; i++) {
            nums[i] = 0;
        }
    }
}

public class TX283 {
    public static void main(String[] args) {

    }
}
