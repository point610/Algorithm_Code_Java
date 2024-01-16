package LeetCode.Easy.LeetCode521;

/**
 * @ClassName LeetCode521
 * @Description TODO
 * @Author point
 * @Date 2023/8/10 0:18
 * @Version 1.0
 */
class Solution {
    public int findLUSlength(String a, String b) {
        return a.equals(b) ? (-1) : Math.max(a.length(), b.length());
    }
}

public class LeetCode521 {
}
