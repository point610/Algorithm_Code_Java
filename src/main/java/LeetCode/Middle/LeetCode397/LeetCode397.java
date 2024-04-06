package LeetCode.Middle.LeetCode397;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

class Solution {
    private Map<Long, Integer> map;

    public int integerReplacement(int n) {
        map = new HashMap<>();
        return dfs((long) n);
    }

    private int dfs(Long n) {
        if (n == 1) {
            return 0;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int ans = 0;
        if (n % 2 == 0) {
            ans = dfs(n / 2);
        } else {
            ans = Math.min(dfs(n - 1), dfs(n + 1));
        }
        ans++;
        map.put(n, ans);
        return ans;
    }
}

public class LeetCode397 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.integerReplacement(7));
        System.out.println(solution.integerReplacement(8));
        System.out.println(solution.integerReplacement(4));
    }
}
