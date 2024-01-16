package CodeTop.HW.HW318;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName HW318
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 16:46
 * @Version 1.0
 */
class Solution {
    public int maxProduct(String[] words) {
        List<Integer> list = new ArrayList<>();
        for (String ss : words) {
            int temp = 0;
            for (char cc : ss.toCharArray()) {
                int step = cc - 'a';
                if ((temp >> step & 1) != 0) {
                    continue;
                }
                temp |= 1 << step;
            }
            list.add(temp);
        }
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if ((list.get(i) & list.get(j)) == 0) {
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }
        return max;
    }
}

public class HW318 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProduct(new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"}));
        System.out.println(solution.maxProduct(new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"}));
        System.out.println(solution.maxProduct(new String[]{"a", "aa", "aaa", "aaaa"}));
    }
}
