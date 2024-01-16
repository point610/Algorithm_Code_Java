package CodeTop.HW.HW49;

import java.util.*;

/**
 * @ClassName HW49
 * @Description TODO
 * @Author point
 * @Date 2023/12/30 17:00
 * @Version 1.0
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String ss : strs) {

            char[] cc = ss.toCharArray();

            Arrays.sort(cc);
            String s = new String(cc);
            if (map.containsKey(s)) {
                map.get(s).add(ss);
            } else {
                map.put(s, new ArrayList<>());
                map.get(s).add(ss);
            }
        }

        List<List<String>> list = new ArrayList<>();
        for (String key : map.keySet()) {
            list.add(map.get(key));
        }
        return list;
    }
}

public class HW49 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
