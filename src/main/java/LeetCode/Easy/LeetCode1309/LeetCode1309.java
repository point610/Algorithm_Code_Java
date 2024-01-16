package LeetCode.Easy.LeetCode1309;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode1309
 * @Description TODO
 * @Author point
 * @Date 2023/9/17 9:42
 * @Version 1.0
 */
class Solution {
    Map<String, String> hashmap = new HashMap<>();

    public String freqAlphabets(String s) {
        // 初始化
        hashmap.put("1", "a");
        hashmap.put("2", "b");
        hashmap.put("3", "c");
        hashmap.put("4", "d");
        hashmap.put("5", "e");
        hashmap.put("6", "f");
        hashmap.put("7", "g");
        hashmap.put("8", "h");
        hashmap.put("9", "i");
        hashmap.put("10#", "j");
        hashmap.put("11#", "k");
        hashmap.put("12#", "l");
        hashmap.put("13#", "m");
        hashmap.put("14#", "n");
        hashmap.put("15#", "o");
        hashmap.put("16#", "p");
        hashmap.put("17#", "q");
        hashmap.put("18#", "r");
        hashmap.put("19#", "s");
        hashmap.put("20#", "t");
        hashmap.put("21#", "u");
        hashmap.put("22#", "LeetCode1413");
        hashmap.put("23#", "w");
        hashmap.put("24#", "x");
        hashmap.put("25#", "y");
        hashmap.put("26#", "z");

        //
        int size = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = size - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                StringBuilder temp = new StringBuilder();
                temp.insert(0, s.charAt(i));
                i--;
                temp.insert(0, s.charAt(i));
                i--;
                temp.insert(0, s.charAt(i));
                stringBuilder.insert(0, hashmap.get(temp.toString()));
            } else {
                stringBuilder.insert(0, hashmap.get(String.valueOf(s.charAt(i))));
            }
        }
        return stringBuilder.toString();
    }
}

public class LeetCode1309 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.freqAlphabets("10#11#12"));

    }
}
