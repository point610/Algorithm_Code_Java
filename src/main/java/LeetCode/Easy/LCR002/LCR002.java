package LeetCode.Easy.LCR002;

/**
 * @ClassName LCR002
 * @Description TODO
 * @Author point
 * @Date 2023/10/5 13:45
 * @Version 1.0
 */
class Solution {
    public String addBinary(String a, String b) {

        StringBuilder tempa = new StringBuilder(a);
        StringBuilder tempb = new StringBuilder(b);
        tempa = tempa.reverse();
        tempb = tempb.reverse();
        StringBuilder stringBuilder = new StringBuilder();
        int aindex = 0;
        int bindex = 0;
        int up = 0;
        while (aindex < tempa.length() && bindex < tempb.length()) {
            int aaa = tempa.charAt(aindex) - '0';
            int bbb = tempb.charAt(bindex) - '0';
            int left = (up + aaa + bbb) % 2;
            up = (up + aaa + bbb) / 2;
            stringBuilder.append(String.valueOf(left));
            aindex++;
            bindex++;
        }
        while (aindex < tempa.length()) {
            int aaa = tempa.charAt(aindex) - '0';
            int left = (up + aaa) % 2;
            up = (up + aaa) / 2;
            aindex++;
            stringBuilder.append(String.valueOf(left));
        }
        while (bindex < tempb.length()) {
            int bbb = tempb.charAt(bindex) - '0';
            int left = (up + bbb) % 2;
            up = (up + bbb) / 2;
            bindex++;
            stringBuilder.append(String.valueOf(left));
        }
        if (up == 1) {
            stringBuilder.append('1');
        }
        return stringBuilder.reverse().toString();

    }
}

public class LCR002 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addBinary("1010", "1011"));
    }
}
