package LeetCode.Easy.LeetCode1408;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName LeetCode1408
 * @Description TODO
 * @Author point
 * @Date 2023/9/24 23:51
 * @Version 1.0
 */
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        Arrays.sort(words, Comparator.comparingInt(String::length));
        int size = words.length;
        for (int i = 0; i < size - 1; i++) {

            // 从后往前
            for (int j = size - 1; j > i; j--) {
                if (words[j].contains(words[i])) {
                    list.add(words[i]);
                    break;
                }
            }

        }
        return list;

    }
}

public class LeetCode1408 {
}

