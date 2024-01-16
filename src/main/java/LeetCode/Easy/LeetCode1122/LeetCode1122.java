package LeetCode.Easy.LeetCode1122;

import java.util.*;

/**
 * @ClassName LeetCode1122
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 17:42
 * @Version 1.0
 */
class Solution {
    Map<Integer, Integer> map = new HashMap<>();

    List<Integer> list = new ArrayList<>();

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int twoSize = arr2.length;
        for (int i = 0; i < twoSize; i++) {
            map.put(arr2[i], 0);
        }

        int oneSize = arr1.length;
        for (int i = 0; i < oneSize; i++) {
            if (map.containsKey(arr1[i])) {
                map.put(arr1[i], map.get(arr1[i]) + 1);
                continue;
            }
            list.add(arr1[i]);
        }

        // 加入res，排序list
        int listSize = list.size();
        int[] listArr = new int[listSize];
        for (int i = 0; i < listSize; i++) {
            listArr[i] = list.get(i);
        }
        Arrays.sort(listArr);
        int[] res = new int[oneSize];
        int index = 0;
        for (int i = 0; i < twoSize; i++) {
            int value = map.get(arr2[i]);
            for (int j = 0; j < value; j++) {
                res[index++] = arr2[i];
            }
        }
        for (int i = 0; i < listSize; i++) {
            res[index++] = listArr[i];
        }
        return res;
    }
}

public class LeetCode1122 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[]{2,1,4,3,9,6});
    }
}
