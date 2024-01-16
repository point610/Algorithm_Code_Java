package CodeTop.HW.HW424;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName HW424
 * @Description TODO
 * @Author point
 * @Date 2023/12/31 20:34
 * @Version 1.0
 */
class Solution {
    public int characterReplacement(String s, int k) {

        // 记录滑动窗口中的字母出现的次数
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put((char) ('A' + i), 0);
        }
        int left = 0;
        int right = 0;
        int mmm = 0;
        int size = s.length();
        while (right < size) {
            char cc = s.charAt(right);
            // 窗口中字母出现的次数累加
            map.put(cc, map.get(cc) + 1);

            mmm = Math.max(mmm, map.get(cc));

            int lll = right - left + 1;
            if (lll > (k + mmm)) {
                // 移除左边下标的字母的数量
                // 窗口中字母出现的次数累减
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                // 超过了合理的长度
                left++;
            }
            right++;
        }
        return right - left;
    }
}

public class HW424 {
}
