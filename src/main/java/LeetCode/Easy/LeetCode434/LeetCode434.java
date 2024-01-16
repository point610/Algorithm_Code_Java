package LeetCode.Easy.LeetCode434;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName LeetCode434
 * @Description TODO
 * @Author point
 * @Date 2023/7/19 0:59
 * @Version 1.0
 */
class Solution {
    public int countSegments(String s) {
        if ("".equals(s)) {
            return 0;
        }
        Pattern pattern = Pattern.compile("[^ ]+");
        Matcher matcher = pattern.matcher(s);
        int res = 0;
        while (matcher.find()) {
            res++;
        }

        return res ;
    }
}

public class LeetCode434 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countSegments("                "));
    }
}
