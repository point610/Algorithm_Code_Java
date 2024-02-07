package CodeTop.HW.HW76;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private Map<Character, Integer> tmap;
    private Map<Character, Integer> currentmap;

    public boolean hasall() {
        for (char key : tmap.keySet()) {
            if (tmap.get(key) > currentmap.get(key)) {
                return false;
            }
        }
        return true;
    }

    public String minWindow(String s, String t) {
        if (s == null || s.length() == 0 || t == null || t.length() == 0 || t.length() > s.length()) {
            return "";
        }
        tmap = new HashMap<>();
        currentmap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char cc = t.charAt(i);
            tmap.put(cc, tmap.getOrDefault(cc, 0) + 1);
            currentmap.put(cc, 0);
        }

        int left = 0;
        int right = 0;
        int ans = Integer.MAX_VALUE;
        int ansleft = 0;
        while (right < s.length()) {
            // right++
            char cc = s.charAt(right);
            if (!currentmap.containsKey(cc)) {
                right++;
                continue;
            }
            currentmap.put(cc, currentmap.getOrDefault(cc, 0) + 1);
            right++;
            if (!hasall()) {
                continue;
            }

            // left++;
            if (ans > right - left) {
                ans = right - left;
                ansleft = left;
            }
            while (true) {
                cc = s.charAt(left);
                if (!currentmap.containsKey(cc)) {
                    left++;
                    continue;
                }
                // has
                currentmap.put(cc, currentmap.get(cc) - 1);
                if (!hasall()) {
                    // 取最小区间
                    if (ans > right - left) {
                        ans = right - left;
                        ansleft = left;
                    }
                    left++;
                    if (left >= right) {
                        break;
                    }
                    cc = s.charAt(left);
                    // 去掉没有的
                    while (!currentmap.containsKey(cc)) {
                        left++;
                        cc = s.charAt(left);
                    }
                    break;
                } else {
                    left++;
                }
            }
        }
        if (ans == Integer.MAX_VALUE) {
            ans = 0;
        }
        return s.substring(ansleft, ansleft + ans);
    }
}

public class HW76 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minWindow("aa", "aa"));
        System.out.println(solution.minWindow("a", "b"));
        System.out.println(solution.minWindow("ADOBECODEBANC", "ABC"));
        System.out.println(solution.minWindow("a", "aa"));
        System.out.println(solution.minWindow("a", "a"));
    }
}
