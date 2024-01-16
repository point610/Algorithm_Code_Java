package LeetCode.Easy.LeetCode2114;

/**
 * @ClassName LeetCode2114
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 19:32
 * @Version 1.0
 */
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        int size = sentences.length;
        for (int i = 0; i < size; i++) {
            max = Math.max(max, sentences[i].split(" ").length);
        }
        return max;
    }
}

public class LeetCode2114 {
}
