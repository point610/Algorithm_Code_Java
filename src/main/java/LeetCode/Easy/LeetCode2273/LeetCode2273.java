package LeetCode.Easy.LeetCode2273;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LeetCode2273
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 0:19
 * @Version 1.0
 */
class Solution {
    public List<String> removeAnagrams(String[] words) {
        int size = words.length;
        String[] temp = new String[size];
        for (int i = 0; i < size; i++) {
            char[] chars = words[i].toCharArray();
            Arrays.sort(chars);
            temp[i] = new String(chars);
        }
        List<Integer> indexs = new LinkedList<>();
        int current = 0;
        indexs.add(0);
        for (int i = 1; i < size; i++) {
            if (!temp[current].equals(temp[i])) {
                indexs.add(i);
                current = i;
            }
        }
        List<String> res = new LinkedList<>();
        for (int i = 0; i < indexs.size(); i++) {
            res.add(words[indexs.get(i)]);
        }
        return res;
    }
}

public class LeetCode2273 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.removeAnagrams(new String[]{"abba", "baba", "bbaa", "cd", "cd"});
    }
}
