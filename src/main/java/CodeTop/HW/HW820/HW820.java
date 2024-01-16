package CodeTop.HW.HW820;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName HW82
 * @Description TODO
 * @Author point
 * @Date 2023/12/30 19:18
 * @Version 1.0
 */
class Solution {
    public int minimumLengthEncoding(String[] words) {
        Arrays.sort(words, (o1, o2) -> o2.length() - o1.length());
        int sum = 0;
        Set<String> set = new HashSet<>();
        for (String ss : words) {
            boolean sign = true;
            for (String ssss : set) {
                if (ssss.lastIndexOf(ss) == (ssss.length() - ss.length())) {
                    sign = false;
                    break;
                }
            }
            if (sign) {
                set.add(ss);
                sum += (1 + ss.length());
            }

        }
        return sum;
    }
}

public class HW820 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minimumLengthEncoding(new String[]{"time", "me", "bell"}));
        System.out.println(solution.minimumLengthEncoding(new String[]{"t"}));
        System.out.println(solution.minimumLengthEncoding(new String[]{"t"}));
    }
}
