package CodeTop.HW.HW554;

import java.util.*;

/**
 * @ClassName HW554
 * @Description TODO
 * @Author point
 * @Date 2023/12/25 15:35
 * @Version 1.0
 */
class Solution {
    public int leastBricks(List<List<Integer>> wall) {

        Map<Integer, Integer> local_number = new HashMap<>();
        for (List<Integer> ll : wall) {
            int sum = 0;
            for (int i = 0; i < ll.size(); i++) {
                sum += ll.get(i);
                ll.set(i, sum);
                if (i == ll.size() - 1) {
                    continue;
                }
                local_number.put(sum, local_number.getOrDefault(sum, 0) + 1);
            }
        }

        int max = 0;
        for (Integer key : local_number.keySet()) {
            max = Math.max(max, local_number.get(key));
        }
        return wall.size() - max;

    }
}

public class HW554 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> wall = new ArrayList<>(); // 添加给定的二维整数数组到List<List<Integer>>中
        // 二维数组
        int[][] inputArray = {
                {1, 2, 2, 1},
                {3, 1, 2},
                {1, 3, 2},
                {2, 4},
                {3, 1, 2},
                {1, 3, 1, 1}
        };

        // 将二维数组加入到 List<List<Integer>> 中
        for (int[] row : inputArray) {
            wall.add(Arrays.asList(Arrays.stream(row).boxed().toArray(Integer[]::new)));
        }

        System.out.println(solution.leastBricks(wall));
    }
}
