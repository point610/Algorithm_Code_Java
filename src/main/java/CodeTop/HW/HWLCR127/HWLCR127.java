package CodeTop.HW.HWLCR127;

/**
 * @ClassName HWLCR127
 * @Description TODO
 * @Author point
 * @Date 2023/12/23 16:07
 * @Version 1.0
 */
class Solution {
    public int trainWays(int num) {
        if (num == 0) {
            return 1;
        }
        int[] list = new int[num + 1];
        list[0] = 1;
        list[1] = 1;
        for (int i = 2; i <= num; i++) {
            list[i] = (list[i - 1] + list[i - 2]) % 1000000007;
        }
        return list[num];
    }
}

public class HWLCR127 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.trainWays(0));
        System.out.println(solution.trainWays(5));
    }
}
