package LeetCode.Middle.LeetCode754;


import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int k = 0;
        while (target > 0) {
            k++;
            target -= k;
        }
        return target % 2 == 0 ? k : k + 1 + k % 2;
    }
}

public class LeetCode754 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reachNumber(2));
        System.out.println(solution.reachNumber(3));
    }
}
