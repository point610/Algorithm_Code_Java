package LeetCode.Easy.LeetCode2899;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode2899
 * @Description TODO
 * @Author point
 * @Date 2024/1/16 22:56
 * @Version 1.0
 */
class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {

        List<Integer> lll = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        int index = -1;
        for (String ss : words) {
            if (ss.equals("prev")) {
                if (index < 0) {
                    lll.add(-1);
                } else {
                    lll.add(l.get(index--));
                }
            } else {
                l.add(Integer.parseInt(ss));
                index = l.size() - 1;
            }
        }
        return lll;
    }
}

public class LeetCode2899 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> ss = new ArrayList<>();
        ss.add("1");
        ss.add("prev");
        ss.add("2");
        ss.add("prev");
        ss.add("prev");
        System.out.println(solution.lastVisitedIntegers(ss));
    }
}
