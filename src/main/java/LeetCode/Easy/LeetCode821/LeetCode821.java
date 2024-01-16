package LeetCode.Easy.LeetCode821;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode821
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 21:44
 * @Version 1.0
 */
class Solution {
    List<Integer> elist = new ArrayList<>();

    int listSize = 0;

    public int[] shortestToChar(String s, char c) {
        int size = s.length();
        int[] res = new int[size];

        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == c) {
                elist.add(i);
            }
        }
        listSize = elist.size();

        // 开始计算
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == c) {
                continue;
            }
            res[i] = getDistance(i);
        }
        return res;
    }

    private int getDistance(int index) {
        if (index < elist.get(0)) {
            return Math.abs(elist.get(0) - index);
        }
        if (index > elist.get(listSize - 1)) {
            return Math.abs(elist.get(listSize - 1) - index);
        }

        for (int i = 0; i < listSize - 1; i++) {
            if (elist.get(i) < index && index < elist.get(i + 1)) {
                return Math.min(Math.abs(elist.get(i) - index), Math.abs(elist.get(i + 1) - index));
            }
        }
        return 0;
    }
}

public class LeetCode821 {
}
