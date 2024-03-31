package LeetCode.Easy.LeetCode3079;

class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += getnumber(num);
        }
        return sum;
    }

    private int getnumber(int one) {
        int max = 0;
        int times = 0;
        while (one != 0) {
            max = Math.max(max, one % 10);
            one /= 10;
            times++;
        }
        int res = 0;
        for (int i = 0; i < times; i++) {
            res = res * 10 + max;
        }
        return res;
    }

}

public class LeetCode3079 {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.sumOfEncryptedInt(new int[]{1, 2, 3}));
        System.out.println(solution.sumOfEncryptedInt(new int[]{10,21,31}));
    }}
