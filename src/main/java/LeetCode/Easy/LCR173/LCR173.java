package LeetCode.Easy.LCR173;

/**
 * @ClassName LCR173
 * @Description TODO
 * @Author point
 * @Date 2023/10/9 22:36
 * @Version 1.0
 */
class Solution {
    public int takeAttendance(int[] records) {
        for (int i = 0; i < records.length; i++) {
            if (records[i] != i) {
                return i;
            }
        }
        return records.length;
    }
}

public class LCR173 {
}
