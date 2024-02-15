package CodeTop.TX.TX171;

class Solution {
    public int titleToNumber(String columnTitle) {
        int aaa = 0;
        int step = 1;
        int size = columnTitle.length();
        for (int i = size - 1; i >= 0; i--) {
            aaa += ((columnTitle.charAt(i) - 'A' + 1) * step);
            step *= 26;
        }

        return aaa;
    }
}

public class TX171 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.titleToNumber("A"));
        System.out.println(solution.titleToNumber("AB"));
        System.out.println(solution.titleToNumber("ZY"));
    }
}
