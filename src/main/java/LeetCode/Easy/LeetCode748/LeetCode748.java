package LeetCode.Easy.LeetCode748;

import java.util.HashMap;

/**
 * @ClassName LeetCode748
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 12:19
 * @Version 1.0
 */
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int size = licensePlate.length();
        for (int i = 0; i < size; i++) {
            if ('a' <= licensePlate.charAt(i) && licensePlate.charAt(i) <= 'z') {
                hashMap.put(licensePlate.charAt(i), hashMap.getOrDefault(licensePlate.charAt(i), 0) + 1);
            }
            if ('A' <= licensePlate.charAt(i) && licensePlate.charAt(i) <= 'Z') {
                char temp = (char) (licensePlate.charAt(i) - 'A' + 'a');
                hashMap.put(temp, hashMap.getOrDefault(temp, 0) + 1);
            }
        }
        size = words.length;
        String res = "aaaaaaaaaaaaaaaaaaaa";
        for (int i = 0; i < size; i++) {
            boolean sign = true;
            int[] temp = new int[26];

            int tempSize = words[i].length();
            for (int j = 0; j < tempSize; j++) {
                temp[words[i].charAt(j) - 'a']++;
            }
            // 检查这个单词
            for (Character key : hashMap.keySet()) {
                if (hashMap.get(key) > temp[key - 'a']) {
                    sign = false;
                    break;
                }
            }
            // 检查成功
            if (sign&&res.length() > words[i].length()) {
                res = words[i];
            }
        }


        return res;

    }
}

public class LeetCode748 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.shortestCompletingWord("1s3 PSt", new String[]{"step", "steps", "stripe", "stepple"}));

    }
}
