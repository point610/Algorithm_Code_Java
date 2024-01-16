package LeetCode.Easy.LeetCode2515;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LeetCode2515
 * @Description TODO
 * @Author point
 * @Date 2023/10/2 12:55
 * @Version 1.0
 */
class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        List<Integer> listindex = new LinkedList<>();
        int size = words.length;
        for (int i = 0; i < size; i++) {
            if (words[i].equals(target)) {
                listindex.add(i);
            }
        }
        if (listindex.size() == 0) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < listindex.size(); i++) {
            int temp = Math.min(Math.abs(startIndex - listindex.get(i)), size - Math.abs(startIndex - listindex.get(i)));
            min = Math.min(temp, min);
        }
        return min;

    }
}

public class LeetCode2515 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.closetTarget(new String[]{
                "hello", "i", "am", "leetcode", "hello"
        }, "hello", 1));
    }
}
