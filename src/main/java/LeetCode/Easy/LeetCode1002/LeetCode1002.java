package LeetCode.Easy.LeetCode1002;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode1002
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 13:36
 * @Version 1.0
 */
class Solution {
    boolean first = true;

    public List<String> commonChars(String[] words) {
        int[] res = new int[26];
        int[] temp = new int[26];

        int size = words.length;
        for (int i = 0; i < size; i++) {
            int tempSize = words[i].length();
            for (int j = 0; j < tempSize; j++) {
                temp[words[i].charAt(j) - 'a']++;
            }
            getMax(res, temp);
            zoreTemp(temp);
        }
        // 将结果进行包装
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (res[i] != 0) {
                for (int j = 0; j < res[i]; j++) {
                    list.add(String.valueOf((char) (i + 'a')));
                }
            }
        }
        return list;
    }

    void getMax(int[] res, int[] temp) {
        if (first) {
            for (int i = 0; i < 26; i++) {
                res[i] = temp[i];
            }
            first = false;
        } else {
            for (int i = 0; i < 26; i++) {
                res[i] = Math.min(res[i], temp[i]);
            }
        }

    }

    void zoreTemp(int[] temp) {
        for (int i = 0; i < 26; i++) {
            temp[i] = 0;
        }
    }
}

public class LeetCode1002 {
    public static void main(String[] args) {
        Solution solution =
                new Solution();
        solution.commonChars(new String[]{"cool","lock","cook"});
    }
}
