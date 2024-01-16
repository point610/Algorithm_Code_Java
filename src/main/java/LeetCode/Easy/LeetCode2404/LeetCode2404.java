package LeetCode.Easy.LeetCode2404;

/**
 * @ClassName LeetCode2404
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 16:01
 * @Version 1.0
 */
class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] times = new int[100001];
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            times[nums[i]]++;
        }
        int maxnumber = -1;
        int max = 0;
        for (int i = 0; i < 100001; i += 2) {
            if (max < times[i]) {
                max = times[i];
                maxnumber = i;
            }
        }
        return maxnumber;

    }
}

public class LeetCode2404 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mostFrequentEven(new int[]{0,1,2,2,4,4,1}));
    }
}
