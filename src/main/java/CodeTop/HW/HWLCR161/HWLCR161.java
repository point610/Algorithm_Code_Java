package CodeTop.HW.HWLCR161;


/**
 * @ClassName HWLCR161
 * @Description TODO
 * @Author point
 * @Date 2023/12/23 21:05
 * @Version 1.0
 */
class Solution {
    public int maxSales(int[] sales) {
        int sum = sales[0];
        int max = sales[0];
        for (int i = 1; i < sales.length; i++) {
            sum = Math.max(sum + sales[i], sales[i]);
            max = Math.max(sum, max);
        }
        return max;
    }
}

public class HWLCR161 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxSales(new int[]{
                -2, 1, -3, 4, -1, 2, 1, -5, 4
        }));
        System.out.println(solution.maxSales(new int[]{
                5, 4, -1, 7, 8
        }));
    }
}
