package LeetCode.Middle.LeetCode443;

class Solution {
    public int compress(char[] chars) {
        int left = 0;
        int index = 0;
        int times = 0;
        int tempindex = 0;

        while (index < chars.length) {
            times = 0;
            tempindex = index;
            while (index < chars.length && chars[index] == chars[tempindex]) {
                index++;
                times++;
            }
            chars[left] = chars[tempindex];
            left++;
            if (times == 1) {
                continue;
            }
            char[] temp = getchars(times);
            for (int i = 0; i < temp.length; i++) {
                chars[left++] = temp[i];
            }
        }
        //System.out.println(chars);
        return left;
    }

    private char[] getchars(int one) {
        return Integer.toString(one).toCharArray();
    }

}

public class LeetCode443 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.compress(new char[]{'a', 'a', 'a', 'b', 'b', 'c', 'c'}));
        System.out.println(solution.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
        System.out.println(solution.compress(new char[]{'a'}));
        System.out.println(solution.compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}));
    }
}
