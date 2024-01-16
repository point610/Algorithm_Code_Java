package LeetCode.Middle.LeetCode17_11;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode17_11
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 19:10
 * @Version 1.0
 */
class Solution {
    public int findClosest(String[] words, String word1, String word2) {
        if (word1.equals(word2)) {
            return 0;
        }
        int size = words.length;
        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (words[i].equals(word1)) {
                one.add(i);
            } else if (words[i].equals(word2)) {
                two.add(i);
            }
        }

        int min = 1000000;
        int oneIndex = 0;
        int oneSize = one.size();
        int twoIndex = 0;
        int twoSize = two.size();

        while (oneIndex < oneSize && twoIndex < twoSize) {
            if (two.get(twoIndex) < one.get(oneIndex)) {
                min = Math.min(min, one.get(oneIndex) - two.get(twoIndex));
                twoIndex++;
            } else {
                if (oneIndex == oneSize - 1) {
                    min = Math.min(min, two.get(twoIndex) - one.get(oneIndex));
                } else {
                    min = Math.min(Math.min(min, Math.abs(one.get(oneIndex + 1) - two.get(twoIndex))), two.get(twoIndex) - one.get(oneIndex));
                }
                oneIndex++;
            }
        }
        return min;

    }
}

public class LeetCode17_11 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findClosest(new String[]{"I", "am", "a", "student", "from", "a", "university", "in", "a", "city"},
                "a", "student"));
    }
}
