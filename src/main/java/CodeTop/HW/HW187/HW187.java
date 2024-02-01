package CodeTop.HW.HW187;

import java.util.*;

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() <= 10) {
            return res;
        }
        Map<String, Integer> map = new HashMap<>();
        int size = s.length();
        for (int i = 0; i <= size - 10; i++) {
            int end = i + 10;
            String sub = s.substring(i, end);
            map.put(sub, map.getOrDefault(sub, 0) + 1);
            if (map.get(sub) == 2) {
                res.add(sub);
            }
        }
        return res;
    }
}

public class HW187 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findRepeatedDnaSequences("AAAAAAAAAAA"));
        System.out.println(solution.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
        System.out.println(solution.findRepeatedDnaSequences("AAAAAAAAAAAAA"));
    }


}
