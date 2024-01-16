package LeetCode.Easy.LeetCode1805;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode1805
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 19:03
 * @Version 1.0
 */
class Solution {
    boolean isnumber(char c) {
        return '0' <= c && c <= '9';
    }

    public int numDifferentIntegers(String word) {
        int size = word.length();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < size; i++) {
            if (!isnumber(word.charAt(i))) {
                continue;
            }

            if (isnumber(word.charAt(i))) {

                int startindex = i;
                while (startindex < size && word.charAt(startindex) == '0') {
                    startindex++;
                }
                while (i < size && isnumber(word.charAt(i))) {
                    i++;
                }
                if (startindex == i) {
                    set.add("0");
                }else {
                    set.add(word.substring(startindex, i));
                }

            }
        }
        return set.size();
    }
}

public class LeetCode1805 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numDifferentIntegers( "a123bc34d8ef34"));
        // System.out.println(Double.parseDouble("167278959591294"));
    }
}
