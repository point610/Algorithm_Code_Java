package CodeTop.HW.HW786;

import java.util.*;

/**
 * @ClassName HW786
 * @Description TODO
 * @Author point
 * @Date 2023/12/31 11:55
 * @Version 1.0
 */
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {

        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Double.compare((arr[o1[0]] * 1.0 / arr[o1[1]]), (arr[o2[0]] * 1.0 / arr[o2[1]]));
            }
        });
        int size = arr.length;

        // 不移动one的下标
        for (int i = 0, j = size - 1; i < Math.min(size, k); j--, i++) {
            queue.add(new int[]{0, j});
        }
        List<int[]> list = new ArrayList<>();
        while (k-- > 0 && !queue.isEmpty()) {
            int[] temp = queue.poll();
            int one = temp[0];
            int two = temp[1];

            list.add(new int[]{arr[one], arr[two]});

            // 移动one的下标
            if (one + 1 < size) {
                queue.offer(new int[]{one + 1, two});
            }

        }
        return list.get(list.size() - 1);
    }
}

public class HW786 {
    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.kthSmallestPrimeFraction(new int[]{1, 2, 3, 5}, 3)));
    }
}
