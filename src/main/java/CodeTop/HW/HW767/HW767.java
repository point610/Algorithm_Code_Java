package CodeTop.HW.HW767;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName HW767
 * @Description TODO
 * @Author point
 * @Date 2023/12/28 11:54
 * @Version 1.0
 */
class Solution {
    public String reorganizeString(String s) {
        int size = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (Character cc : s.toCharArray()) {
            map.put(cc, map.getOrDefault(cc, 0) + 1);
        }
        int max = 0;
        char keyyy = 0;
        for (Character key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                keyyy = key;
            }
            if (size - map.get(key) + 1 < map.get(key)) {
                return "";
            }
        }

        char[] ccc = new char[size];
        int index = 0;
        for (int i = 0; i < map.get(keyyy); i++) {
            ccc[index] = keyyy;
            index += 2;
        }

        for (Character key : map.keySet()) {
            if (key == keyyy) {
                continue;
            }
            for (int i = 0; i < map.get(key); i++) {
                if (index >= size) {
                    index = 1;
                }
                ccc[index] = key;
                index += 2;
            }

        }

        return new String(ccc);
    }
}

public class HW767 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reorganizeString("aab"));
        System.out.println(solution.reorganizeString("aaab"));
    }
}
