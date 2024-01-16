package LeetCode.Easy.LeetCode819;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName LeetCode819
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 18:58
 * @Version 1.0
 */
class Solution {
    Map<String, Integer> hashMap = new HashMap<>();

    public String mostCommonWord(String paragraph, String[] banned) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(paragraph);
        while (matcher.find()) {
            String temp = matcher.group().toLowerCase();
            hashMap.put(temp, hashMap.getOrDefault(temp, 0) + 1);
        }

        // 根据banned去掉map中的数值
        int size = banned.length;
        for (int i = 0; i < size; i++) {
            String temp = banned[i].toLowerCase();
            if (hashMap.containsKey(temp)) {
                hashMap.put(temp, 0);
            }
        }
        String res = "";
        int max = 0;
        for (String key : hashMap.keySet()) {
            if (hashMap.get(key) > max) {
                max = hashMap.get(key);
                res = key;
            }
        }

        return res;
    }
}

public class LeetCode819 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",
                new String[]{"hit"}));
    }
}
