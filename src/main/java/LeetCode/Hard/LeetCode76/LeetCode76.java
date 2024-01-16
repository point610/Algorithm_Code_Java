package LeetCode.Hard.LeetCode76;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode76
 * @Description TODO
 * @Author point
 * @Date 2023/8/4 23:52
 * @Version 1.0
 */
class Solution {
    Map<Character, Integer> hashMap = new HashMap<>();

    // 检查hashmap中是否所有的数都为0
    boolean isAll0() {
        for (char key : hashMap.keySet()) {
            if (hashMap.get(key) < 0) {
                return false;
            }
        }
        return true;
    }

    public String minWindow(String s, String t) {
        int tSize = t.length();
        int sSize = s.length();
        if (tSize > sSize) {
            return "";
        }

        // 将t字符串加入map中
        for (int i = 0; i < tSize; i++) {
            if (hashMap.containsKey(t.charAt(i))) {
                hashMap.put(t.charAt(i), hashMap.get(t.charAt(i)) - 1);
            } else {
                hashMap.put(t.charAt(i), -1);
            }
        }
        int left = 0;
        int minLeft = 0;
        int minLen = 1000000;

        // 使用滑动窗口来计数
        for (int i = 0; i < sSize; i++) {

            // 右边的一直加
            if (hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
            }

            if (i >= tSize - 1) {
                // 去掉左边不属于t的字符
                while (left < i && !hashMap.containsKey(s.charAt(left))) {
                    left++;
                }

                // // 测试去掉左边的字符之后是否满足条件
                // hashMap.put(s.charAt(left), hashMap.get(s.charAt(left)) - 1);
                // left++;
                boolean sign = false;

                // 满足条件
                while (isAll0()) {
                    sign = true;
                    // 去掉左边不属于t的字符
                    while (!hashMap.containsKey(s.charAt(left))) {
                        left++;
                    }
                    // 记录最值
                    if (minLen > i - left + 1) {
                        minLeft = left;
                        minLen = i - left + 1;
                    }

                    // 测试去掉左边的字符之后是否满足条件
                    hashMap.put(s.charAt(left), hashMap.get(s.charAt(left)) - 1);
                    left++;
                }

                // 不满足条件，回退
                if (sign) {
                    left--;
                    hashMap.put(s.charAt(left), hashMap.get(s.charAt(left)) + 1);
                }

            }


        }
        if (minLen == 1000000) {
            return "";
        }
        return s.substring(minLeft, minLeft + minLen);

    }
}

public class LeetCode76 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minWindow("ADOBECODEBANC", "ABC"));
    }
}
