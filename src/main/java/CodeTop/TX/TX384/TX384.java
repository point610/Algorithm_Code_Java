package CodeTop.TX.TX384;

import java.util.Random;

class Solution {
    private int[] nums;
    private int size;
    private Random random = new Random();

    public Solution(int[] nums) {
        this.nums = nums;
        this.size = nums.length;
    }

    public int[] reset() {
        return nums;
    }

    public int[] shuffle() {
        int[] res = nums.clone();
        for (int i = 0; i < size; i++) {
            swap(res, i, i + random.nextInt(size - i));
        }
        return res;
    }

    private void swap(int[] res, int one, int two) {
        int temp = res[one];
        res[one] = res[two];
        res[two] = temp;
    }
}

public class TX384 {
}
