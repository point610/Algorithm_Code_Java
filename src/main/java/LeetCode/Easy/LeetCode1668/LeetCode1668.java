package LeetCode.Easy.LeetCode1668;

/**
 * @ClassName LeetCode1668
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 14:40
 * @Version 1.0
 */
class Solution {
    public int maxRepeating(String sequence, String word) {
        int times = 0;
        String temp = word;
        while (true) {
            if (sequence.contains(temp)) {
                times++;
            } else {
                break;
            }
            temp += word;

        }
        return times;
    }
}

public class LeetCode1668 {
}
