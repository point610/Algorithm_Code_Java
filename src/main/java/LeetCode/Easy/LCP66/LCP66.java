package LeetCode.Easy.LCP66;

/**
 * @ClassName LCP66
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 19:19
 * @Version 1.0
 */
class Solution {
    int[] getlist(String s) {
        int size = s.length();
        int[] list = new int[26];
        for (int i = 0; i < size; i++) {
            list[s.charAt(i) - 'a']++;
        }
        return list;
    }

    public int minNumBooths(String[] demand) {
        int size = demand.length;
        int[] listres = new int[26];
        for (int i = 0; i < size; i++) {
            int[] temp = getlist(demand[i]);
            for (int j = 0; j < 26; j++) {
                listres[j] = Math.max(listres[j], temp[j]);
            }
        }
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            sum += listres[i];
        }
        return sum;
    }
}

public class LCP66 {
}
