package CodeTop.HW.HW665;

/**
 * @ClassName HW665
 * @Description TODO
 * @Author point
 * @Date 2023/12/24 16:20
 * @Version 1.0
 */
class Solution {
    public boolean checkPossibility(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int index = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                index = i;
                break;
            }
        }


        int[] onelist = new int[nums.length - 1];
        int[] twolist = new int[nums.length - 1];
        int oneindex = 0;
        int twoindex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != index) {
                onelist[oneindex++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != index + 1) {
                twolist[twoindex++] = nums[i];
            }
        }

        boolean one = true;
        boolean two = true;
        for (int i = 1; i < onelist.length; i++) {
            if (onelist[i - 1] > onelist[i]) {
                one = false;
                break;
            }
        }
        for (int i = 1; i < twolist.length; i++) {
            if (twolist[i - 1] > twolist[i]) {
                two = false;
                break;
            }
        }
        return one || two;

    }
}

public class HW665 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.checkPossibility(new int[]{4, 2, 3}));
        System.out.println(solution.checkPossibility(new int[]{4, 2, 1}));
        System.out.println(solution.checkPossibility(new int[]{3, 4, 2, 3}));
    }
}
