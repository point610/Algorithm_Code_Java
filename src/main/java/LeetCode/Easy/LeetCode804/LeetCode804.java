package LeetCode.Easy.LeetCode804;

import java.util.*;

/**
 * @ClassName LeetCode804
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 17:08
 * @Version 1.0
 */
class Solution {
    Map<Character, String> hashMap = new HashMap<>();

    Map<Integer, List<String>> IntegerMap = new HashMap<>();

    public int uniqueMorseRepresentations(String[] words) {
        initial();
        int size = words.length;
        if (size == 1) {
            return size;
        }
        for (int i = 0; i < size; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            int tempSize = words[i].length();
            for (int j = 0; j < tempSize; j++) {
                stringBuilder.append(hashMap.get(words[i].charAt(j)));
            }
            if (IntegerMap.containsKey(stringBuilder.length())) {
                IntegerMap.get(stringBuilder.length()).add(String.valueOf(stringBuilder));
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(String.valueOf(stringBuilder));
                IntegerMap.put(stringBuilder.length(), temp);
            }
        }

        // 开始比较
        int res = words.length;
        for (Integer key : IntegerMap.keySet()) {
            List<String> temp = IntegerMap.get(key);
            int tempSize = temp.size();
            if (tempSize == 1) {
                continue;
            }

            for (int i = 0; i < tempSize - 1; i++) {
                for (int j = i + 1; j < tempSize; j++) {
                    if (temp.get(i).equals(temp.get(j))) {
                        res--;
                        break;
                    }

                }
            }

        }
        return res;
    }

    void initial() {
        hashMap.put('a', ".-");
        hashMap.put('b', "-...");
        hashMap.put('c', "-.-.");
        hashMap.put('d', "-..");
        hashMap.put('e', ".");
        hashMap.put('f', "..-.");
        hashMap.put('g', "--.");
        hashMap.put('h', "....");
        hashMap.put('i', "..");
        hashMap.put('j', ".---");
        hashMap.put('k', "-.-");
        hashMap.put('l', ".-..");
        hashMap.put('m', "--");
        hashMap.put('n', "-.");
        hashMap.put('o', "---");
        hashMap.put('p', ".--.");
        hashMap.put('q', "--.-");
        hashMap.put('r', ".-.");
        hashMap.put('s', "...");
        hashMap.put('t', "-");
        hashMap.put('u', "..-");
        hashMap.put('v', "...-");
        hashMap.put('w', ".--");
        hashMap.put('x', "-..-");
        hashMap.put('y', "-.--");
        hashMap.put('z', "--..");

    }
}

public class LeetCode804 {
    public static void main(String[] args) {
        Solution solution =
                new Solution();
        System.out.println(solution.uniqueMorseRepresentations(new String[]{"rwjje", "aittjje", "auyyn", "lqtktn", "lmjwn"}));
    }
}
