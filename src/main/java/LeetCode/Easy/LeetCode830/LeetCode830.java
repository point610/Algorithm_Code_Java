package LeetCode.Easy.LeetCode830;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName LeetCode830
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 21:53
 * @Version 1.0
 */
class Solution {
    // 起始位置和数量
    Map<Integer, Integer> map = new HashMap<>();

    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();

        int size = s.length();
        for (int i = 0; i < size; i++) {
            char temp = s.charAt(i);
            int index = i;
            while (index < size && temp == s.charAt(index)) {
                index++;
            }
            if (index - i >= 3) {
                map.put(i, index - i);
            }
            i = index - 1;
        }
        // 对map进行检查
        for (Integer key : map.keySet()) {
            List<Integer> temp = new ArrayList<>();
            temp.add(key);
            temp.add(map.get(key) + key - 1);
            res.add(temp);
        }
        res.sort(((o1, o2) -> {
            return Integer.compare(o1.get(0), o2.get(0));
        }));
        //
        // for (int i = 0; i < res.size(); i++) {
        //     System.out.println(res.get(i).get(0) + " " + res.get(i).get(1));
        // }

        //

        return res;
    }
}

public class LeetCode830 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.largeGroupPositions("oocccccccccmmmmmmttt");
    }
}
