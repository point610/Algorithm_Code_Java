package CodeTop.TX.TX189;

class Solution {
    public void rotate(int[] nums, int k) {

        int size = nums.length;
        if (k == 0 || k % size == 0) {
            return;
        }
        k = k % size;
        reverse(nums, 0, size - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, size - 1);

    }

    private void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

public class TX189 {
}
