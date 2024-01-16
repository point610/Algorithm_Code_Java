package LeetCode.Easy.LeetCode2073;

/**
 * @ClassName LeetCode2073
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 13:04
 * @Version 1.0
 */
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        int times = 0;
        int index = 0;
        int size = tickets.length;
        while (tickets[k] != 0) {
            if (tickets[index % size] != 0) {
                times++;
                tickets[index % size]--;
                index++;
            }else {
                index++;
            }
        }
        return times;
    }
}

public class LeetCode2073 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.timeRequiredToBuy(new int[]{2, 3, 2}, 2));
    }
}
