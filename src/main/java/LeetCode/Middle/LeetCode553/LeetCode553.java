package LeetCode.Middle.LeetCode553;

class Solution {
    public String optimalDivision(int[] nums) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            stringBuilder.append(nums[i]);
            if (i != nums.length - 1) {
                stringBuilder.append('/');
            }
        }

        if (nums.length > 2) {
            stringBuilder.insert(stringBuilder.indexOf("/") + 1, "(");
            stringBuilder.append(")");
        }

        return stringBuilder.toString();
    }
}

public class LeetCode553 {
}
