package LeetCode.Easy.LeetCode2383;

/**
 * @ClassName LeetCode2383
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 15:53
 * @Version 1.0
 */
class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int engsum = 1;
        for (int i = 0; i < energy.length; i++) {
            engsum += energy[i];
        }

        int res = Math.max(0, engsum - initialEnergy);
        int secondsum = initialExperience;
        for (int i = 0; i < experience.length; i++) {
            if (secondsum > experience[i]) {
                secondsum += experience[i];
            } else {
                int sub = experience[i] + 1 - secondsum;
                secondsum += (sub + experience[i]);
                res += sub;
            }
        }
        return res;
    }
}

public class LeetCode2383 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minNumberOfHours(2, 4, new int[]{1}, new int[]{3}));
    }
}
