package LeetCode.Middle.LeetCode848;

class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int size = s.length();
        long[] tempstep = new long[size];
        long temp = 0;
        for (int i = 0; i < size; i++) {
            temp += shifts[size - i - 1];
            tempstep[size - i - 1] = temp;
        }


        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < size; i++) {
            char c = s.charAt(i);
            c = (char) ((c - 'a' + tempstep[i]) % 26 + 'a');
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}

public class LeetCode848 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.shiftingLetters("mkgfzkkuxownxvfvxasy", new int[]{505870226, 437526072, 266740649, 224336793, 532917782, 311122363, 567754492, 595798950, 81520022, 684110326, 137742843, 275267355, 856903962, 148291585, 919054234, 467541837, 622939912, 116899933, 983296461, 536563513}));
        System.out.println(solution.shiftingLetters("abc", new int[]{3, 5, 9}));
        System.out.println(solution.shiftingLetters("aaa", new int[]{1, 2, 3}));
    }
}
