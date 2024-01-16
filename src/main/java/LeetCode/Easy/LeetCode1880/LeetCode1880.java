package LeetCode.Easy.LeetCode1880;

/**
 * @ClassName LeetCode1880
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 11:22
 * @Version 1.0
 */
class Solution {
    int getNumber(String s) {
        int res = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            res *= 10;
            res += s.charAt(i) - 'a';
        }
        return res;
    }

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        return (getNumber(firstWord) + getNumber(secondWord)) == getNumber(targetWord);

    }

}

public class LeetCode1880 {
}
