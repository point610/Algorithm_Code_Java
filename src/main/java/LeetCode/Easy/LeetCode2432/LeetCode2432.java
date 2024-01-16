package LeetCode.Easy.LeetCode2432;

/**
 * @ClassName LeetCode2432
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 17:19
 * @Version 1.0
 */
class Solution {
    public int hardestWorker(int n, int[][] logs) {

        int maxid = logs[0][0];
        int max = logs[0][1];
        int size = logs.length;
        for (int i = 1; i < size; i++) {
            if (max < (logs[i][1] - logs[i - 1][1])) {
                max = logs[i][1] - logs[i - 1][1];
                maxid = logs[i][0];
            } else if (max == (logs[i][1] - logs[i - 1][1])) {
                maxid = Math.min(maxid,logs[i][0]);
            }
        }
        return maxid;

    }
}

public class LeetCode2432 {
}
