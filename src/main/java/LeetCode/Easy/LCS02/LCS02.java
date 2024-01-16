package LeetCode.Easy.LCS02;

import java.util.*;

/**
 * @ClassName LCS02
 * @Description TODO
 * @Author point
 * @Date 2023/10/10 19:22
 * @Version 1.0
 */
class Solution {
    public int halfQuestions(int[] questions) {
        Map<Integer, Integer> map = new HashMap<>();

        int size = questions.length;
        for (int i = 0; i < size; i++) {
            map.put(questions[i], map.getOrDefault(questions[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            list.add(map.get(key));
        }
        Collections.sort(list, (o1, o2) -> o2 - o1);
        int sum = 0;
        int times = 0;
        size = list.size();
        for (int i = 0; i < size; i++) {
            times++;
            sum +=list.get(i);
            if (sum >= questions.length / 2) {
                return times;
            }
        }
        return times;
    }
}

public class LCS02 {
}
