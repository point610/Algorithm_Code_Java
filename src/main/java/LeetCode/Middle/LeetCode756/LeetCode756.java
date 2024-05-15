package LeetCode.Middle.LeetCode756;

import java.util.*;

class Solution {
    Map<String, List<Character>> two2all;

    public boolean pyramidTransition(String bottom, List<String> allowed) {
        two2all = new HashMap<>();
        for (int i = 0; i < allowed.size(); i++) {
            char a = allowed.get(i).charAt(0);
            char b = allowed.get(i).charAt(1);
            char c = allowed.get(i).charAt(2);
            String ab = String.valueOf(a) + b;
            List<Character> all = two2all.getOrDefault(ab, new ArrayList<>());
            all.add(c);
            two2all.put(ab, all);
        }
        return dfs(bottom, "");
    }

    public boolean dfs(String pre, String cur) {
        if (pre.length() == 1) {
            return true;
        }
        if (cur.length() + 1 == pre.length()) {
            return dfs(cur, "");
        }
        char a = pre.charAt(cur.length());
        char b = pre.charAt(cur.length() + 1);
        String all = String.valueOf(a) + b;
        if (two2all.containsKey(all)) {
            for (char x : two2all.get(all)) {
                if (dfs(pre, cur + x)) {
                    return true;
                }
            }
        }
        return false;
    }
}

public class LeetCode756 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.pyramidTransition("BCD", Arrays.asList(new String[]{"BCC", "CDE", "CEA", "FFF"})));
        System.out.println(solution.pyramidTransition("AAAA", Arrays.asList(new String[]{"AAB", "AAC", "BCD", "BBE", "DEF"})));
    }
}
