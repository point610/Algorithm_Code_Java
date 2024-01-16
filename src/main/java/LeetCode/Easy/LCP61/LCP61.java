package LeetCode.Easy.LCP61;

/**
 * @ClassName LCP61
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 19:12
 * @Version 1.0
 */
class Solution {
    int[] getlist(int[] templist) {
        int size = templist.length;
        int[] listA = new int[size - 1];
        for (int i = 0; i < size - 1; i++) {
            if (templist[i + 1] == templist[i]) {
                listA[i] = 0;
            } else if (templist[i + 1] < templist[i]) {
                listA[i] = -1;
            } else {
                listA[i] = 1;
            }
        }
        return listA;
    }

    public int temperatureTrend(int[] temperatureA, int[] temperatureB) {
        int size = temperatureA.length;
        int[] listA = getlist(temperatureA);
        int[] listB = getlist(temperatureB);
        int max = 0;
        for (int i = 0; i < size - 1; i++) {

            if (listB[i] == listA[i]) {
                int same = 0;
                while (i < size - 1 && listB[i] == listA[i]) {
                    i++;
                    same++;
                }
                max = Math.max(max, same);
            }
        }
        return max;
    }
}

public class LCP61 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.temperatureTrend(new int[]{5, 10, 16, -6, 15, 11, 3}, new int[]{16, 22, 23, 23, 25, 3, -16}));
    }
}
