package LeetCode.Easy.LeetCode2423;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode2423
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 16:23
 * @Version 1.0
 */
class Solution {
    public boolean equalFrequency(String word) {
        int size = word.length();
        int[] arr = new int[26];
        for (int i = 0; i < size; i++) {
            arr[word.charAt(i) - 'a']++;
        }
        int numberofhas = 0;
        Set<Integer> times = new HashSet<>();
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 0) {
                continue;
            }
            numberofhas++;
            max = Math.max(max, arr[i]);
            times.add(arr[i]);
        }
        if (numberofhas == 1) {
            return true;
        }
        if (times.size() == 1) {
            if (max == 1) {
                return true;
            } else {
                return false;
            }
        }
        // 多种
        if (times.size() != 2) {
            return false;
        }
        // 2 kinds
        int onetimes = 0;
        int maxtimes = 0;
        int step = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] == max) {
                maxtimes++;
            }
            if (arr[i] == 1) {
                onetimes++;
            }
            if (arr[i] != 0) {
                step = Math.max(step, Math.abs(max - arr[i]));
            }
        }
        if (onetimes == 1) {
            return true;
        }
        if (maxtimes != 1) {
            return false;
        }
        if (step != 1) {
            return false;
        }
        return true;

    }
}

public class LeetCode2423 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.equalFrequency("zz"));
    }
}
