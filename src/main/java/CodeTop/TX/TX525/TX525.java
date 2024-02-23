package CodeTop.TX.TX525;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findMaxLength(int[] nums) {
        // value ---- index
        Map<Integer, Integer> map = new HashMap<>();
        int current = 0;
        map.put(0, -1);
        int max = 0;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] == 0) {
                current--;
            } else {
                current++;
            }

            if (map.containsKey(current)) {
                max = Math.max(max, i - map.get(current));
            } else {
                map.put(current, i);
            }

        }
        return max;
    }
}

public class TX525 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findMaxLength(new int[]{0, 1}));
        System.out.println(solution.findMaxLength(new int[]{0, 1, 0}));
    }
}
