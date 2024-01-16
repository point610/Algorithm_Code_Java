package CodeTop.HW.HW134;

/**
 * @ClassName HW134
 * @Description TODO
 * @Author point
 * @Date 2023/12/30 17:11
 * @Version 1.0
 */
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int startindex = 0;
        int size = gas.length;
        while (startindex < size) {
            int sum = 0;
            int currentindex = startindex % size;
            int times = 0;
            while (times < size) {
                int has = gas[currentindex % size];
                sum += has;
                int co = cost[currentindex % size];
                if (sum < co) {
                    break;
                }
                sum -= co;
                currentindex = (currentindex + 1) % size;
                times++;
            }

            if (times == size) {
                return startindex;
            } else {
                startindex = startindex + times + 1;
            }

        }
        return -1;
    }
}

public class HW134 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
        System.out.println(solution.canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
    }
}
