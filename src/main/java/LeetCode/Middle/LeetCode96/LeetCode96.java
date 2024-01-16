package LeetCode.Middle.LeetCode96;

/**
 * @ClassName LeetCode96
 * @Description TODO
 * @Author point
 * @Date 2023/8/29 23:32
 * @Version 1.0
 */
class Solution {
    public int numTrees(int n) {
        // 提示：我们在这里需要用 long 类型防止计算过程中的溢出
        long res = 1;
        for (int i = 0; i < n; ++i) {
            res = res * 2 * (2 * i + 1) / (i + 2);
        }
        return (int) res;
    }
}
public class LeetCode96 {
}
