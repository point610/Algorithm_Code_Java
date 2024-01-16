package LeetCode.Easy.LeetCode500;

import java.util.ArrayList;

/**
 * @ClassName LeetCode500
 * @Description TODO
 * @Author point
 * @Date 2023/8/3 23:08
 * @Version 1.0
 */
class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        int size = words.length;
        int[] indexWeight = new int[]{
                2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3
        };
        for (int i = 0; i < size; i++) {
            String temp = words[i].toLowerCase();
            int tempSize = temp.length();
            int sum = 0;
            for (int j = 0; j < tempSize; j++) {
                sum += indexWeight[temp.charAt(j) - 'a'];
            }

            // 结果比较
            if (sum == indexWeight[temp.charAt(0) - 'a'] * tempSize) {
                list.add(words[i]);
            }
        }

        return list.toArray(new String[0]);
    }
}

public class LeetCode500 {
    public static void main(String[] args) {
        String one = "qwertyuiop";
        String two = "asdfghjkl";
        String three = "zxcvbnm";
        for (int i = 0; i < 26; i++) {
            String c = String.valueOf((char) ('a' + i));
            if (one.contains(c)) {
                System.out.print(1);
            } else if (two.contains(c)) {
                System.out.print(2);
            } else if (three.contains(c)) {
                System.out.print(3);
            }
            System.out.print(',');
        }
    }
}
