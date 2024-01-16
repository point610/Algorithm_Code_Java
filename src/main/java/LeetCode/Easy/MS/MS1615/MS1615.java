package LeetCode.Easy.MS.MS1615;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MS1615
 * @Description TODO
 * @Author point
 * @Date 2023/10/12 15:38
 * @Version 1.0
 */
class Solution {
    public int[] masterMind(String solution, String guess) {
        int same = 0;
        Map<Character, Integer> one = new HashMap<>();
        Map<Character, Integer> two = new HashMap<>();
        int size = solution.length();
        for (int i = 0; i < size; i++) {
            if (solution.charAt(i) == guess.charAt(i)) {
                same++;
            } else {
                one.put(solution.charAt(i), one.getOrDefault(solution.charAt(i), 0) + 1);
                two.put(guess.charAt(i), two.getOrDefault(guess.charAt(i), 0) + 1);
            }
        }
        int wei = 0;
        wei += Math.min(one.getOrDefault('R',0), two.getOrDefault('R',0));
        wei += Math.min(one.getOrDefault('G',0), two.getOrDefault('G',0));
        wei += Math.min(one.getOrDefault('Y',0), two.getOrDefault('Y',0));
        wei += Math.min(one.getOrDefault('B',0), two.getOrDefault('B',0));
        return new int[]{same, wei};
    }
}

public class MS1615 {
}
