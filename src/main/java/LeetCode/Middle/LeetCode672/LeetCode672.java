package LeetCode.Middle.LeetCode672;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int flipLights(int n, int k) {
        if (k == 0) return 1;
        if (n == 1) return 2;
        else if (n == 2) return k == 1 ? 3 : 4;
        else return k == 1 ? 4 : k == 2 ? 7 : 8;
    }
}

public class LeetCode672 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.flipLights(1, 1));
        System.out.println(solution.flipLights(2, 1));
        System.out.println(solution.flipLights(3, 1));
    }
}
