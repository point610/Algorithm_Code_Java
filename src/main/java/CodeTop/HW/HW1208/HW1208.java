package CodeTop.HW.HW1208;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        List<Integer> lll = new ArrayList<>();

        int sum = 0;


        int size = s.length();
        for (int i = 0; i < size; i++) {
            sum += Math.abs(s.charAt(i) - t.charAt(i));
            lll.add(Math.abs(s.charAt(i) - t.charAt(i)));
        }
        if (sum <= maxCost) {
            return size;
        }
        int max = 0;

        int left = 0;
        int right = 0;
        sum = 0;
        while (right < size) {
            while (right < size && (sum) <= maxCost) {
                sum += lll.get(right);
                right++;
            }
            // 当sum小于或等于maxCost时，为一种加法模式
            if (sum <= maxCost) {
                max = Math.max(max, right - left);
            } else {
                max = Math.max(max, right - left - 1);
            }

            if (right >= size) {
                break;
            }

            while (sum > maxCost) {
                sum -= lll.get(left);
                left++;
            }
        }

        return max;
    }
}

public class HW1208 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.equalSubstring("nfyvfrvrbinpwkepscnnzfyiuznrp", "eclliczkrezvhyvoyhbuurhkhtvto", 194));
        System.out.println(solution.equalSubstring("tyiraojpcfuttwblehv", "stbtakjkampohttraky", 119));
        System.out.println(solution.equalSubstring("krpgjbjjznpzdfy", "nxargkbydxmsgby", 14));
        System.out.println(solution.equalSubstring("abcd", "cdef", 3));
        System.out.println(solution.equalSubstring("abcd", "acde", 0));
        System.out.println(solution.equalSubstring("krrgw", "zjxss", 19));
        System.out.println(solution.equalSubstring("abcd", "bcdf", 3));
    }
}
