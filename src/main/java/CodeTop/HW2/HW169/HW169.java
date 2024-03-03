package CodeTop.HW2.HW169;
class Solution {
    public int majorityElement(int[] nums) {
        int size = nums.length;
        int currenttimes = 1;
        int nnn = nums[0];
        for (int i = 1; i < size; i++) {
            if (currenttimes == 0) {
                nnn = nums[i];
                currenttimes = 1;
                continue;
            }
            if (nnn == nums[i]) {
                currenttimes++;
            } else {
                currenttimes--;
            }
        }
        return nnn;
    }
}

public class HW169 {
}
