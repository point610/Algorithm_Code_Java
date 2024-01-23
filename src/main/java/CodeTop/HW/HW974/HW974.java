package CodeTop.HW.HW974;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0;
        int aa = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int ii : nums) {
            sum += ii;
            int mod = (sum % k + k) % k;
            int temp = map.getOrDefault(mod, 0);
            aa += temp;
            map.put(mod, temp + 1);
        }
        return aa;
    }
}

public class HW974 {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.subarraysDivByK(new int[]{4, 5, 0, -2, -3, 1}, 5));
        System.out.println(solution.subarraysDivByK(new int[]{5}, 9));
        System.out.println(solution.subarraysDivByK(new int[]{-5}, 5));
        System.out.println(solution.subarraysDivByK(new int[]{-1, 2, 9}, 2));
    }
}

