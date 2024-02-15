package CodeTop.TX.TX268;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int missingNumber(int[] nums) {
        int temp = 0;
        Set<Integer> set = new HashSet<>();
        for (int ii : nums) {
            set.add(ii);
        }

        while (true) {
            if (!set.contains(temp)) {
                return temp;
            }
            temp++;
        }
    }
}

public class TX268 {
    public static void main(String[] args) {
        Solution solution=new Solution();
    }}
