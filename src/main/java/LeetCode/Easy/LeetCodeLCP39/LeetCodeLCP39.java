package LeetCode.Easy.LeetCodeLCP39;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCodeLCP39
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 1:10
 * @Version 1.0
 */
class Solution {
    Map<Integer, Integer> map = new HashMap<>();

    public int minimumSwitchingTimes(int[][] source, int[][] target) {

        int row = source.length;
        int column = source[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                map.put(source[i][j], map.getOrDefault(source[i][j], 0) + 1);
            }
        }
        // 开始处理target
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                map.put(target[i][j], map.getOrDefault(target[i][j], 0) - 1);
            }
        }
        int res = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) > 0) {
                res+=map.get(key);
            }
        }
        return res;
    }
}

public class LeetCodeLCP39 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.minimumSwitchingTimes(new int[][]{{989, 498, 941, 850, 992, 367, 914, 224, 143, 144, 98, 819, 932, 723, 617, 151, 102, 76, 871, 339, 574, 363, 324, 656, 210, 566, 454, 534, 64, 941, 938, 96, 861, 728, 804, 641, 627, 848, 342, 748, 721, 65, 940, 228, 823, 146, 557, 94, 328, 521, 502, 309, 299, 128, 341, 945, 209, 819, 561, 295, 94, 818, 325, 248, 189, 842, 34, 673, 488, 92, 776, 898, 946, 863, 920, 946, 554, 401, 723, 283, 832, 870, 917, 604, 973, 594, 462, 677, 718, 813, 85, 628, 499, 646, 866, 249, 750, 120, 226, 814}
        }, new int[][]{{524, 415, 803, 311, 489, 598, 930, 517, 289, 774, 634, 257, 546, 830, 924, 318, 748, 921, 701, 484, 104, 445, 626, 935, 990, 489, 887, 267, 825, 562, 15, 737, 409, 845, 685, 2, 506, 889, 250, 334, 892, 196, 582, 245, 991, 823, 459, 83, 897, 956, 112, 565, 724, 561, 835, 554, 987, 618, 602, 456, 611, 395, 590, 298, 194, 192, 628, 267, 71, 696, 134, 154, 40, 83, 717, 850, 700, 858, 538, 535, 242, 221, 696, 846, 430, 282, 505, 657, 939, 366, 333, 119, 602, 344, 195, 17, 278, 723, 381, 175}});
    }
}
