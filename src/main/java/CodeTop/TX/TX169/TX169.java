package CodeTop.TX.TX169;

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

public class TX169 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.majorityElement(new int[]{10, 9, 9, 9, 10}));
        System.out.println(solution.majorityElement(new int[]{3, 2, 3}));
        System.out.println(solution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
