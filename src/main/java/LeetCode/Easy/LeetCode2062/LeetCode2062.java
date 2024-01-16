package LeetCode.Easy.LeetCode2062;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LeetCode2062
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 11:19
 * @Version 1.0
 */
class Solution {
    boolean isyuanyin(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    int getnumber(String s) {
        int sum = 0;
        int size = s.length();
        for (int i = 0; i < size - 4; i++) {
            for (int j = i + 5; j <= size; j++) {
                String temp = s.substring(i, j);
                if (hasfive(temp)) {
                    sum++;
                }
            }
        }

        return sum;
    }

    boolean hasfive(String s) {
        boolean a = false;
        boolean e = false;
        boolean i = false;
        boolean o = false;
        boolean u = false;
        int size = s.length();
        for (int j = 0; j < size; j++) {
            switch (s.charAt(j)) {
                case 'a': {
                    a = true;
                    break;
                }
                case 'e': {
                    e = true;
                    break;
                }
                case 'i': {
                    i = true;
                    break;
                }
                case 'o': {
                    o = true;
                    break;
                }
                case 'u': {
                    u = true;
                    break;
                }
            }
        }
        return a && e && i && o && u;

    }

    public int countVowelSubstrings(String word) {
        List<String> list = new LinkedList<>();
        int size = word.length();
        for (int i = 0; i < size; i++) {
            if (isyuanyin(word.charAt(i))) {
                int startindex = i;
                while (i < size && isyuanyin(word.charAt(i))) {
                    i++;
                }
                list.add(word.substring(startindex, i));

            }
        }

        // check list
        size = list.size();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (list.get(i).length() < 5) {
                continue;
            }
            sum += getnumber(list.get(i));
        }
        return sum;

    }
}

public class LeetCode2062 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countVowelSubstrings("uieaouieaouieaouieaouieaouieaouieaouieaouieaouieaouieaouieaouieaouieaouieaouieaouieaouieaouieaouieao"));
    }
}
