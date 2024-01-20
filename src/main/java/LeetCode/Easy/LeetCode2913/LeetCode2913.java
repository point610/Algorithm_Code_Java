package LeetCode.Easy.LeetCode2913;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int sumCounts(List<Integer> nums) {
        int size = nums.size();
        int sum = 0;
        for (int i = 0; i < size ; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < size; j++) {
                set.add(nums.get(j));
                sum = (sum + set.size() * set.size()) % 1000000007;
            }
        }
        return sum % 1000000007;
    }
}

public class LeetCode2913 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(1);
        System.out.println(solution.sumCounts(integers));
    }
}
