package LeetCode.Easy.LCR075;

/**
 * @ClassName LCR075
 * @Description TODO
 * @Author point
 * @Date 2023/10/7 23:26
 * @Version 1.0
 */
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] times = new int[1001];
        int size = arr1.length;
        for (int i = 0; i < size; i++) {
            times[arr1[i]]++;
        }
        int[] res = new int[size];
        int index = 0;
        size = arr2.length;
        for (int i = 0; i < size; i++) {
            while (times[arr2[i]] != 0) {
                res[index++] = arr2[i];
                times[arr2[i]]--;
            }
        }
        for (int i = 0; i <= 1000; i++) {
            while (times[i] != 0) {
                res[index++] = i;
                times[i]--;
            }
        }
        return res;
    }
}

public class LCR075 {
}
