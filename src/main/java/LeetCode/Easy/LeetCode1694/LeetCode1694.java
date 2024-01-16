package LeetCode.Easy.LeetCode1694;

/**
 * @ClassName LeetCode1694
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 14:57
 * @Version 1.0
 */
class Solution {
    public String reformatNumber(String number) {
        int size = number.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (number.charAt(i) != ' ' && number.charAt(i) != '-') {
                stringBuilder.append(number.charAt(i));
            }
        }
        int left = stringBuilder.length() % 3;
        switch (left) {
            case 1: {
                StringBuilder res = new StringBuilder();
                size = stringBuilder.length();
                int i = 1;
                for (i = 1; i <= size - 2; i++) {
                    res.append(stringBuilder.charAt(i - 1));
                    if (i % 3 == 0) {
                        res.append('-');
                    }
                }
                res.append('-');
                res.append(stringBuilder.charAt(i++ - 1));
                res.append(stringBuilder.charAt(i++ - 1));
                return res.toString();
            }
            case 2: {
            }
            case 0: {
                StringBuilder res = new StringBuilder();
                size = stringBuilder.length();
                for (int i = 1; i <= size; i++) {
                    res.append(stringBuilder.charAt(i - 1));
                    if (i != size && i % 3 == 0) {
                        res.append('-');
                    }
                }
                return res.toString();
            }
        }
        return "";
    }
}

public class LeetCode1694 {
}
