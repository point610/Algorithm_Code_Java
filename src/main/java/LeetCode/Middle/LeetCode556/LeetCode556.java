package LeetCode.Middle.LeetCode556;

import java.util.Arrays;

class Solution {
    public int nextGreaterElement(int n) {
        StringBuilder stringBuilder = new StringBuilder(Integer.toString(n));
        int size = stringBuilder.length();
        int index = alldown(stringBuilder);
        if (index == -1) {
            return -1;
        }
        int bigindex = size - 1;
        while (bigindex > index && stringBuilder.charAt(index) >= stringBuilder.charAt(bigindex)) {
            bigindex--;
        }
        char[] list = stringBuilder.toString().toCharArray();
        swap(list, index, bigindex);
        Arrays.sort(list, index + 1, size);

        long ll = Long.parseLong(new String(list));
        if (ll > Integer.MAX_VALUE) {
            return -1;
        }
        return (int) ll;
    }

    private void swap(char[] list, int index, int bigindex) {
        char temp = list[index];
        list[index] = list[bigindex];
        list[bigindex] = temp;
    }

    private int alldown(StringBuilder stringBuilder) {
        int size = stringBuilder.length();
        for (int i = size - 2; i >= 0; i--) {
            if (stringBuilder.charAt(i) < stringBuilder.charAt(i + 1)) {
                return i;
            }
        }
        return -1;
    }
}

public class LeetCode556 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.nextGreaterElement(12));
        System.out.println(solution.nextGreaterElement(21));
    }
}
