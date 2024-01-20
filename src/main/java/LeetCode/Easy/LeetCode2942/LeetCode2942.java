package LeetCode.Easy.LeetCode2942;

import com.sun.corba.se.impl.ior.FreezableList;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> lll = new ArrayList<>();

        int index = 0;
        for (String ss : words) {
            if (ss.indexOf(x) != -1) {
                lll.add(index);
            }
            index++;
        }
        return lll;
    }
}

public class LeetCode2942 {
}
