package LeetCode.Middle.LeetCode464;

import java.util.HashMap;
import java.util.Map;

class Solution {
    Map<Integer, Boolean> memo = new HashMap<Integer, Boolean>();

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if ((1 + maxChoosableInteger) * (maxChoosableInteger) / 2 < desiredTotal) {
            return false;
        }
        return dfs(maxChoosableInteger, 0, desiredTotal, 0);
    }

    public boolean dfs(int maxChoosableInteger, int usedNumbers, int desiredTotal, int currentTotal) {
        if (!memo.containsKey(usedNumbers)) {
            boolean res = false;
            for (int i = 0; i < maxChoosableInteger; i++) {
                // 使用一个整数来保存使用过的数值
                // 没使用过
                if (((usedNumbers >> i) & 1) == 0) {
                    // 自己赢了
                    if (i + 1 + currentTotal >= desiredTotal) {
                        res = true;
                        break;
                    }
                    // 对手输了
                    if (!dfs(maxChoosableInteger, usedNumbers | (1 << i), desiredTotal, currentTotal + i + 1)) {
                        res = true;
                        break;
                    }
                }
            }
            // 记录当前的输赢的状态
            memo.put(usedNumbers, res);
        }
        // 返回输赢的状态
        return memo.get(usedNumbers);
    }
}

public class LeetCode464 {
}
