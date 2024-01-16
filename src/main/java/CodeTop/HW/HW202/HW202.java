package CodeTop.HW.HW202;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

/**
 * @ClassName HW202
 * @Description TODO
 * @Author point
 * @Date 2023/12/23 20:18
 * @Version 1.0
 */
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (!set.contains(n)) {
            String one = String.valueOf(n);
            set.add(n);
            int sum = 0;
            for (Character cc : one.toCharArray()) {
                sum += (cc - '0') * (cc - '0');
            }
            if (sum == 1) {
                return true;
            }
            n = sum;
        }
        return false;
    }
}

public class HW202 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isHappy(19));
    }
}
