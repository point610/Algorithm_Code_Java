package LeetCode.Middle.LeetCode907;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int sumSubarrayMins(int[] arr) {
        List<Integer> list = new ArrayList<>();

        list.add(0);
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            list.add(arr[i] + list.get(i));
        }

        long res = 0;
        for (int i = 1; i < size; i++) {
            for (int j = i + 1; j <= size; j++) {
                res = (res + list.get(j) - list.get(i)) % 100000007;//注意取模
            }
        }
        return (int) res;
    }
}

public class LeetCode907 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.sumSubarrayMins(new int[]{3, 1, 2, 4}));
        System.out.println(solution.sumSubarrayMins(new int[]{11, 81, 94, 43, 3}));
    }
}
