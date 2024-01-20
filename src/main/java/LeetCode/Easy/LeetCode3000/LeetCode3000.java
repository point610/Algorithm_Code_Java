package LeetCode.Easy.LeetCode3000;

class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int area = 0;
        int max = 0;
        for (int[] dimension : dimensions) {
            if (max < dimension[0] * dimension[0] + dimension[1] * dimension[1]) {
                max = dimension[0] * dimension[0] + dimension[1] * dimension[1];
                area = dimension[0] * dimension[1];
            } else if (max == dimension[0] * dimension[0] + dimension[1] * dimension[1]) {
                area = Math.max(area, dimension[0] * dimension[1]);
            }
        }
        return area;
    }
}

public class LeetCode3000 {
}

