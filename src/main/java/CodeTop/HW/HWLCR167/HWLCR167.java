package CodeTop.HW.HWLCR167;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int dismantlingAction(String arr) {
        Set<Character> set = new HashSet<>();
        int size = arr.length();


        int left = 0;
        int right = 0;
        int max = 0;
        while (right < size) {
            char cc = arr.charAt(right);
            while (!set.contains(cc)) {
                set.add(cc);
                right++;
                if (right >= size) {
                    break;
                }
                cc = arr.charAt(right);
            }
            max = Math.max(max, right - left);
            while (arr.charAt(left) != cc) {
                set.remove(arr.charAt(left));
                left++;
            }
            set.remove(arr.charAt(left));
            left++;
            set.add(cc);
            right++;
        }
        return max;
    }
}

public class HWLCR167 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.dismantlingAction("dbascDdad"));
        System.out.println(solution.dismantlingAction("aa"));
        System.out.println(solution.dismantlingAction("pwwkew"));
        System.out.println(solution.dismantlingAction("KKK"));
        System.out.println(solution.dismantlingAction(" "));
        System.out.println(solution.dismantlingAction(""));
    }
}
