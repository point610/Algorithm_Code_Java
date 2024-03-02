package CodeTop.HW2.HW720;

import java.util.*;

class Solution {
    public String longestWord(String[] words) {
        Set<String> set = new HashSet<>();
        for (String word : words) {
            set.add(word);
        }
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o2.compareTo(o1);
                }
                return o1.length() - o2.length();
            }
        });

        for (int i = words.length - 1; i >= 0; i--) {
            if (check(set, words[i])) {
                return words[i];
            }
        }
        return "";
    }

    private boolean check(Set<String> set, String s) {
        while (s.length() != 1) {
            String temp = s.substring(0, s.length() - 1);
            if (set.contains(temp)) {
                s = temp;
            } else {
                return false;
            }
        }
        return true;
    }
}

public class HW720 {
    public static void main(String[] args) {
        String ss = "123";
        System.out.println(ss.substring(0, 1));
    }
}
