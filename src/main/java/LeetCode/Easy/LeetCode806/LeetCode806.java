package LeetCode.Easy.LeetCode806;

/**
 * @ClassName LeetCode806
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 18:02
 * @Version 1.0
 */
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int row = 1;
        int lastRoeNumber = 0;
        int size = s.length();
        int tempRowNumber = 0;
        for (int i = 0; i < size; i++) {
            if (tempRowNumber + widths[s.charAt(i) - 'a'] == 100) {
                tempRowNumber = 0;
                lastRoeNumber = 100;
                row++;
                continue;
            }
            if (tempRowNumber + widths[s.charAt(i) - 'a'] > 100) {
                tempRowNumber = widths[s.charAt(i) - 'a'];
                lastRoeNumber = widths[s.charAt(i) - 'a'];
                row++;
                continue;
            }
            lastRoeNumber = (lastRoeNumber + widths[s.charAt(i) - 'a']) % 100;
            tempRowNumber += widths[s.charAt(i) - 'a'];
        }
        // System.out.println(lastRoeNumber == 100 ? row - 1 : row);
        // System.out.println(lastRoeNumber);
        return new int[]{lastRoeNumber == 100 ? row - 1 : row, lastRoeNumber};
    }
}

public class LeetCode806 {
    public static void main(String[] args) {
        Solution solution =
                new Solution();
        solution.numberOfLines(new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}
                , "abcdefghijklmnopqrstuvwxyz");
    }
}
