package LeetCode.Easy.LeetCode953;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode953
 * @Description TODO
 * @Author point
 * @Date 2023/8/14 22:44
 * @Version 1.0
 */
    class Solution {

        public boolean isAlienSorted(String[] words, String order) {
            Map<Character, Integer> map = new HashMap<>();
            // copy
            int size = order.length();
            for (int i = 0; i < size; i++) {
                map.put(order.charAt(i), i);
            }

            String[] copy = words.clone();
            // 自定义排序
            Arrays.sort(copy, (one, two) -> {
                int oneSize = one.length();
                int twoSize = two.length();
                int min = Math.min(oneSize, twoSize);
                for (int i = 0; i < min; i++) {
                    if (map.get(one.charAt(i)) != map.get(two.charAt(i))) {
                        return Integer.compare(map.get(one.charAt(i)), map.get(two.charAt(i)));
                    }
                }
                return Integer.compare(oneSize, twoSize);
            });


            // 遍历比较
            size = words.length;
            for (int i = 0; i < size; i++) {
                if (!words[i].equals(copy[i])) {
                    return false;
                }
            }
            return true;
        }
    }

public class LeetCode953 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isAlienSorted(new String[]{"apple","app"}, "abcdefghijklmnopqrstuvwxyz");
    }
}
