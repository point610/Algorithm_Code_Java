package LeetCode.Easy.LeetCode2600;

/**
 * @ClassName LeetCode2600
 * @Description TODO
 * @Author point
 * @Date 2023/10/3 12:04
 * @Version 1.0
 */
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (numOnes >= k) {
            return k;
        }
        if (numOnes + numZeros >= k) {
            return numOnes;
        }
        return numOnes - (k - numOnes - numZeros);


    }
}

public class LeetCode2600 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.kItemsWithMaximumSum(3, 2, 0, 4));
    }
}
