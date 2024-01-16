package LeetCode.Middle.LeetCode134;

/**
 * @ClassName LeetCode134
 * @Description TODO
 * @Author point
 * @Date 2023/11/11 22:42
 * @Version 1.0
 */
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int startindex = 0;
        int size = gas.length;
        while (startindex < size) {
            int count = 0;
            int gassum = 0;
            int costsum = 0;
            // 需要打满一周
            while (count < size) {
                int currentindx = (count + startindex) % size;
                gassum += gas[currentindx];
                costsum += cost[currentindx];
                if (gassum < costsum) {
                    break;
                } else {
                    count++;
                }

            }

            // 打满一周了
            if (count == size) {
                return startindex;
            } else {
                // 没有打满一周，将起点移动到下一个位置
                startindex = startindex + count + 1;
            }
        }
        return -1;
    }
}

public class LeetCode134 {
}
