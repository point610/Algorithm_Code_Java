package CodeTop.HW.HW1239;

import sun.security.krb5.internal.rcache.DflCache;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName HW1239
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 10:38
 * @Version 1.0
 */
class Solution {
    int max;

    public int maxLength(List<String> arr) {
        max = 0;
        List<Integer> list = new ArrayList<>();
        for (String ss : arr) {
            int mask = 0;
            for (char cc : ss.toCharArray()) {
                int temp = cc - 'a';
                // ss可能含有重复的字母
                if (((mask >> temp) & 1) != 0) {
                    mask = 0;
                    break;
                }
                mask |= 1 << temp;
            }
            if (mask > 0) {
                list.add(mask);
                max = Math.max(max, Integer.bitCount(mask));
            }
        }

        huisu(list, 0, 0);
        return max;
    }

    private void huisu(List<Integer> list, int index, int mask) {
        if (index == list.size()) {
            max = Math.max(max, Integer.bitCount(mask));
            return;
        }
        if ((list.get(index) & mask) == 0) {
            // 无重复
            huisu(list, index + 1, mask | list.get(index));
        }
        huisu(list, index + 1, mask);
    }
}

public class HW1239 {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}
