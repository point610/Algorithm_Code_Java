package LeetCode.Easy.LeetCode2185;

/**
 * @ClassName LeetCode2185
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 23:01
 * @Version 1.0
 */
class Solution {
    public int prefixCount(String[] words, String pref) {
        int sum = 0;
        int size = words.length;
        for (int i = 0; i < size; i++) {
            if (words[i].indexOf(pref) == 0) {
                sum++;
            }
        }
return sum;
    }
}

public class LeetCode2185 {
}
