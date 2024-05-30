package LeetCode.Middle.LeetCode893;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numSpecialEquivGroups(String[] words) {
        Set<String> set = new HashSet<>();
        for (String word : words) {
            set.add(get(word));
        }
        return set.size();
    }

    private String get(String one) {
        int size = one.length();
        StringBuilder ou = new StringBuilder();
        StringBuilder ji = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                ou.append(one.charAt(i));
            } else {
                ji.append(one.charAt(i));
            }
        }

        char[] oo = ou.toString().toCharArray();
        char[] tt = ji.toString().toCharArray();
        Arrays.sort(oo);
        Arrays.sort(tt);
        return new String(oo) + "," + new String(tt);
    }

}

public class LeetCode893 {
}
